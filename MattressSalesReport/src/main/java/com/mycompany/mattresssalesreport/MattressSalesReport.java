/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

import java.util.Scanner;

/**
 *
 * @author Student
 */

public class MattressSalesReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Single-dimensional array for product names
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // Two-dimensional array for sales (3 products x 3 months)
        int[][] sales = new int[products.length][3];

        // Prompt user for sales data matching the sample screenshot
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }

        // Instantiate Product object
        Product report = new Product(products, sales);

        // Display the generated report matching the sample output format
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("**************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + report.calculateTotalSales());
        System.out.printf("AVERAGE PRODUCT SALES: %.0f\n", report.calculateAverageSales());
        System.out.println("MOST POPULAR PRODUCT: " + report.determineMostPopularProduct());

        scanner.close();
    }
}