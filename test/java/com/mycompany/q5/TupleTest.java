/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iamsu
 */
public class TupleTest {
    
    public TupleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        int x = 0;
        int y = 0;
        Tuple instance = null;
        instance.ChangeData(x, y);
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void testGetXf() {
        System.out.println("getXf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getXf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        System.out.println("getYf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getYf();
        assertEquals(expResult, result);
    }
    
}
