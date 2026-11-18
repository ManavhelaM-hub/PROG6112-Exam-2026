/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.mattresssalesreport;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class ProductTest {
    
    public ProductTest() {
    }

    /**
     * Test of calculateTotalSales method, of class Product.
     */
    @Test
    public void testCalculateTotalSales() {
        System.out.println("calculateTotalSales");
        Product instance = null;
        int expResult = 0;
        int result = instance.calculateTotalSales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateAverageSales method, of class Product.
     */
    @Test
    public void testCalculateAverageSales() {
        System.out.println("calculateAverageSales");
        Product instance = null;
        double expResult = 0.0;
        double result = instance.calculateAverageSales();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determineMostPopularProduct method, of class Product.
     */
    @Test
    public void testDetermineMostPopularProduct() {
        System.out.println("determineMostPopularProduct");
        Product instance = null;
        String expResult = "";
        String result = instance.determineMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetTotalProductsSold method, of class Product.
     */
    @Test
    public void testGetTotalProductsSold() {
        System.out.println("GetTotalProductsSold");
        Product instance = null;
        int expResult = 0;
        int result = instance.GetTotalProductsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetAverageProductSold method, of class Product.
     */
    @Test
    public void testGetAverageProductSold() {
        System.out.println("GetAverageProductSold");
        Product instance = null;
        double expResult = 0.0;
        double result = instance.GetAverageProductSold();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMostPopularProduct method, of class Product.
     */
    @Test
    public void testGetMostPopularProduct() {
        System.out.println("GetMostPopularProduct");
        Product instance = null;
        String expResult = "";
        String result = instance.GetMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
