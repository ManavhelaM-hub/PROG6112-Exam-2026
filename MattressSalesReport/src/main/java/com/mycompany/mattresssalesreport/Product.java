/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */

public class Product implements IProduct {
    private String[] productNames;
    private int[][] salesData; // Rows = products, Columns = months

    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    public int calculateTotalSales() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total += salesData[i][j];
            }
        }
        return total;
    }

    public double calculateAverageSales() {
        int totalProducts = 0;
        int totalItemsCount = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                totalProducts += salesData[i][j];
                totalItemsCount++;
            }
        }
        return totalItemsCount == 0 ? 0 : (double) totalProducts / totalItemsCount;
    }

    public String determineMostPopularProduct() {
        int maxSales = -1;
        int bestProductIndex = 0;

        for (int i = 0; i < productNames.length; i++) {
            int currentProductTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                currentProductTotal += salesData[i][j];
            }
            if (currentProductTotal > maxSales) {
                maxSales = currentProductTotal;
                bestProductIndex = i;
            }
        }
        return productNames[bestProductIndex] + " (" + maxSales + ")";
    }

    @Override
    public int GetTotalProductsSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double GetAverageProductSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String GetMostPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}