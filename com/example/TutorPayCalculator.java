package com.example;

import java.util.Scanner;

public class TutorPayCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== Tutor Pay Calculator ===");
		System.out.print("Enter number of classes: ");
		int numberOfClasses = scanner.nextInt();
		
		System.out.print("Enter number of students: ");
		int numberOfStudents = scanner.nextInt();
		
		System.out.print("Enter pay per class: $");
		double payPerClass = scanner.nextDouble();
		
		System.out.print("Enter pay per student: $");
		double payPerStudent = scanner.nextDouble();
		
		// Calculate total pay
		double totalPay = (numberOfClasses * payPerClass) + (numberOfStudents * payPerStudent);
		
		// Calculate average pay per class
		double averagePayPerClass = totalPay / numberOfClasses;
		
		// Calculate average pay per student
		double averagePayPerStudent = totalPay / numberOfStudents;
		
		// Display results
		System.out.println("\n=== Payment Summary ===");
		System.out.println("Number of Classes: " + numberOfClasses);
		System.out.println("Number of Students: " + numberOfStudents);
		System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
		System.out.println("Average Pay per Class: $" + String.format("%.2f", averagePayPerClass));
		System.out.println("Average Pay per Student: $" + String.format("%.2f", averagePayPerStudent));
		
		scanner.close();
	}
	
	// Method to calculate average pay (can be used programmatically)
	public static double calculateAveragePayPerClass(int numberOfClasses, int numberOfStudents, 
	                                                 double payPerClass, double payPerStudent) {
		double totalPay = (numberOfClasses * payPerClass) + (numberOfStudents * payPerStudent);
		return totalPay / numberOfClasses;
	}
	
	// Method to calculate average pay per student
	public static double calculateAveragePayPerStudent(int numberOfClasses, int numberOfStudents, 
	                                                   double payPerClass, double payPerStudent) {
		double totalPay = (numberOfClasses * payPerClass) + (numberOfStudents * payPerStudent);
		return totalPay / numberOfStudents;
	}
	
	// Method to calculate total pay
	public static double calculateTotalPay(int numberOfClasses, int numberOfStudents, 
	                                      double payPerClass, double payPerStudent) {
		return (numberOfClasses * payPerClass) + (numberOfStudents * payPerStudent);
	}
}

