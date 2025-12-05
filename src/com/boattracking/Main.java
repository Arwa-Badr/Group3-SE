package com.boattracking;

import java.time.LocalDateTime;
import java.util.List;
import javafx.application.Application;

/**
 * Demonstrates the functionality of the boat detection system across
 * three sprints.  Each stage calls the relevant methods and prints
 * results to the console.  This class acts as a simple driver and
 * makes it easy to trace progress across sprints.
 */
public class Main {
    public static void main(String[] args) {
        BoatDetectionSystem system = new BoatDetectionSystem();
        System.out.println("=== Sprint 1: Add a new boat & Retrieve boat information ===");
        Boat boat1 = system.addBoat("chip001");
        System.out.printf("Added boat %s with chip %s%n", boat1.getId(), boat1.getChipId());
        Boat retrieved = system.getBoat(boat1.getId());
        System.out.printf("Retrieved boat: %s%n", retrieved);
        system.displayAllBoats();

        System.out.println("\n=== Sprint 2: Search by ID & Display location ===");
        // Add another boat
        Boat boat2 = system.addBoat("chip002");
        // Update positions
        system.updateBoatLocation(boat1.getId(), 20.0, 40.0, LocalDateTime.of(2025, 1, 1, 10, 0));
        system.updateBoatLocation(boat2.getId(), 22.0, 41.0, LocalDateTime.of(2025, 1, 1, 11, 0));
        // Search for a boat
        Boat searchResult = system.searchBoatById(boat2.getId());
        System.out.printf("Search result for %s: %s%n", boat2.getId(), searchResult);
        // Display a specific boat location
        double[] loc = system.displayBoatLocation(boat1.getId());
        System.out.printf("Location of %s: (%.2f, %.2f)%n", boat1.getId(), loc[0], loc[1]);
        // Show all boats and their status
        system.displayAllBoats();

        System.out.println("\n=== Sprint 3: Detect boat location & Alerts ===");
        // Normal update (inside area)
        system.updateBoatLocation(boat1.getId(), 20.5, 40.5, LocalDateTime.of(2025, 1, 2, 10, 0));
        // Near boundary (yellow)
        system.updateBoatLocation(boat1.getId(), BoatDetectionSystem.MIN_LAT + 0.05, 40.5, LocalDateTime.of(2025, 1, 2, 11, 0));
        // Area breach (red)
        List<Alert> alerts = system.updateBoatLocation(boat1.getId(), 25.0, 43.0, LocalDateTime.of(2025, 1, 2, 12, 0));
        if (!alerts.isEmpty()) {
            System.out.println("Alerts raised:");
            for (Alert a : alerts) {
                System.out.println("  " + a);
            }
        }
        // Display final state of all boats
        system.displayAllBoats();
        // Draw simple map
        System.out.println("\nASCII Map:");
        ConsoleMap.printMap(system.getAllBoats(), 10, 20);
        
        MapView.setSystem(system);
        Application.launch(MapView.class);  

    }
}