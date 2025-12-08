/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cpit250_bayanalharbi_2305950_lab8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author beboa
 */
public class Testing1Test {
    
    @Test
    public void TestCase_isEven1() {
    int a= 2;
    
    boolean executedResult = true;
    
    Testing1 isEven1 = new Testing1
    int actualResult= isEven1.isEven(a);
    assertEquals(executedResult, actualResult);
    }
        
    @Test
    public void TestCase_isEven2() {
    int a= 5;
    
    boolean executedResult = false;
    
    Testing1 isEven2 = new Testing1
    int actualResult= isEven2.isEven(a);
    assertEquals(executedResult, actualResult);
    }
 
    
    
    
    @Test
     public void TestCase_calculatePriceWithTax1() {
     int a= 10;
    
     double executedResult = 11.15;
    
     Testing1 calculatePriceWithTax1 = new Testing1
     int actualResult= calculatePriceWithTax1.calculatePriceWithTax(a);
     assertEquals(executedResult, actualResult);
    }
     
     
     @Test
     public void TestCase_calculatePriceWithTax2() {
     int a= 13;
    
     double executedResult = 13.15;
    
     Testing1 calculatePriceWithTax2 = new Testing1
     int actualResult= calculatePriceWithTax2.calculatePriceWithTax(a);
     assertEquals(executedResult, actualResult);
    }
     
     
     
     
     
     @Test
     public void TestCase_calculateAge1(){
     int a= 2004;
    
     int executedResult = 21;
    
     Testing1 calculateAge1 = new Testing1
     int actualResult= calculateAge1.calculateAge(a);
     assertEquals(executedResult, actualResult);
    }
     
     
     @Test
     public void TestCase_calculateAge2(){
     int a= 2000;
    
     int executedResult = 25;
    
     Testing1 calculateAge2 = new Testing1
     int actualResult= calculateAge2.calculateAge(a);
     assertEquals(executedResult, actualResult);
    }
     
     
     
     
}
