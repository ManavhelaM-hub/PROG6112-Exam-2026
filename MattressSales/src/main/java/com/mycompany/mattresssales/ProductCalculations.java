/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
    
public class ProductCalculations implements IProductCalculations {
    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    public double calculateVat() {
        // VAT: 15% of the product price[cite: 2]
        return price * 0.15;
    }

    public double calculateCommission() {
        // Commission: 5% of the product price[cite: 2]
        return price * 0.05;
    }

    public double calculateTotalSale() {
        // Total Sale Amount: Price + VAT + Commission[cite: 2]
        return price + calculateVat() + calculateCommission();
    }

    @Override
    public double GetVat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double GetCommission() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double GetTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  