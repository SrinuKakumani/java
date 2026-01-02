package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryDiscountCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== Grocery Discount Calculator ===");
		System.out.print("Enter number of grocery items: ");
		int numberOfItems = scanner.nextInt();
		
		// Store grocery information
		List<GroceryItem> groceries = new ArrayList<>();
		
		// Collect information for each grocery item
		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("\n--- Grocery Item " + i + " ---");
			scanner.nextLine(); // consume newline
			System.out.print("Enter grocery name: ");
			String groceryName = scanner.nextLine();
			
			System.out.print("Enter MRP (Maximum Retail Price): $");
			double mrp = scanner.nextDouble();
			
			System.out.print("Enter discount percentage: ");
			double discountPercent = scanner.nextDouble();
			
			// Calculate discount amount and final price
			double discountAmount = calculateDiscount(mrp, discountPercent);
			double finalPrice = calculateFinalPrice(mrp, discountPercent);
			
			// Store grocery information
			groceries.add(new GroceryItem(groceryName, mrp, discountPercent, discountAmount, finalPrice));
		}
		
		// Display results
		System.out.println("\n=== Grocery Bill with Discount ===");
		System.out.println(String.format("%-20s %-15s %-15s %-15s %-15s", 
			"Grocery", "MRP", "Discount %", "Discount Amount", "Final Price"));
		System.out.println("--------------------------------------------------------------------------------");
		
		double totalMRP = 0;
		double totalDiscount = 0;
		double totalFinalPrice = 0;
		
		for (GroceryItem item : groceries) {
			System.out.println(String.format("%-20s $%-14.2f %-14.1f%% $%-14.2f $%-14.2f",
				item.getName(), item.getMrp(), item.getDiscountPercent(), 
				item.getDiscountAmount(), item.getFinalPrice()));
			
			totalMRP += item.getMrp();
			totalDiscount += item.getDiscountAmount();
			totalFinalPrice += item.getFinalPrice();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(String.format("%-20s $%-14.2f %-14s $%-14.2f $%-14.2f",
			"TOTAL", totalMRP, "", totalDiscount, totalFinalPrice));
		
		// Display summary
		System.out.println("\n=== Summary ===");
		System.out.println("Total MRP: $" + String.format("%.2f", totalMRP));
		System.out.println("Total Discount: $" + String.format("%.2f", totalDiscount));
		System.out.println("Total Amount to Pay: $" + String.format("%.2f", totalFinalPrice));
		System.out.println("Total Savings: $" + String.format("%.2f", totalDiscount));
		
		scanner.close();
	}
	
	// Method to calculate discount amount
	public static double calculateDiscount(double mrp, double discountPercent) {
		return (mrp * discountPercent) / 100;
	}
	
	// Method to calculate final price after discount
	public static double calculateFinalPrice(double mrp, double discountPercent) {
		double discountAmount = calculateDiscount(mrp, discountPercent);
		return mrp - discountAmount;
	}
	
	// Helper class to store grocery item information
	static class GroceryItem {
		private String name;
		private double mrp;
		private double discountPercent;
		private double discountAmount;
		private double finalPrice;
		
		public GroceryItem(String name, double mrp, double discountPercent, 
		                  double discountAmount, double finalPrice) {
			this.name = name;
			this.mrp = mrp;
			this.discountPercent = discountPercent;
			this.discountAmount = discountAmount;
			this.finalPrice = finalPrice;
		}
		
		// Getters
		public String getName() { return name; }
		public double getMrp() { return mrp; }
		public double getDiscountPercent() { return discountPercent; }
		public double getDiscountAmount() { return discountAmount; }
		public double getFinalPrice() { return finalPrice; }
	}
}

