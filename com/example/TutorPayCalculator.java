package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TutorPayCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== Tutor Pay Calculator (Multiple Tutors) ===");
		System.out.print("Enter number of tutors: ");
		int numberOfTutors = scanner.nextInt();
		
		// Store tutor information
		List<TutorInfo> tutors = new ArrayList<>();
		
		// Collect information for each tutor
		for (int i = 1; i <= numberOfTutors; i++) {
			System.out.println("\n--- Tutor " + i + " ---");
			System.out.print("Enter tutor name: ");
			scanner.nextLine(); // consume newline
			String tutorName = scanner.nextLine();
			
			System.out.print("Enter number of classes: ");
			int numberOfClasses = scanner.nextInt();
			
			System.out.print("Enter number of students: ");
			int numberOfStudents = scanner.nextInt();
			
			System.out.print("Enter pay per class: $");
			double payPerClass = scanner.nextDouble();
			
			System.out.print("Enter pay per student: $");
			double payPerStudent = scanner.nextDouble();
			
			// Calculate totals
			double totalPay = calculateTotalPay(numberOfClasses, numberOfStudents, payPerClass, payPerStudent);
			double averagePayPerClass = calculateAveragePayPerClass(numberOfClasses, numberOfStudents, payPerClass, payPerStudent);
			double averagePayPerStudent = calculateAveragePayPerStudent(numberOfClasses, numberOfStudents, payPerClass, payPerStudent);
			
			// Store tutor information
			tutors.add(new TutorInfo(tutorName, numberOfClasses, numberOfStudents, 
			                         payPerClass, payPerStudent, totalPay, 
			                         averagePayPerClass, averagePayPerStudent));
		}
		
		// Display results for each tutor
		System.out.println("\n=== Payment Summary for All Tutors ===");
		for (int i = 0; i < tutors.size(); i++) {
			TutorInfo tutor = tutors.get(i);
			System.out.println("\n--- " + tutor.getName() + " ---");
			System.out.println("Number of Classes: " + tutor.getNumberOfClasses());
			System.out.println("Number of Students: " + tutor.getNumberOfStudents());
			System.out.println("Total Pay: $" + String.format("%.2f", tutor.getTotalPay()));
			System.out.println("Average Pay per Class: $" + String.format("%.2f", tutor.getAveragePayPerClass()));
			System.out.println("Average Pay per Student: $" + String.format("%.2f", tutor.getAveragePayPerStudent()));
		}
		
		// Display comparison summary
		if (tutors.size() > 1) {
			System.out.println("\n=== Comparison Summary ===");
			double grandTotalPay = 0;
			int totalClasses = 0;
			int totalStudents = 0;
			double highestPay = Double.MIN_VALUE;
			double lowestPay = Double.MAX_VALUE;
			String highestPaidTutor = "";
			String lowestPaidTutor = "";
			
			for (TutorInfo tutor : tutors) {
				grandTotalPay += tutor.getTotalPay();
				totalClasses += tutor.getNumberOfClasses();
				totalStudents += tutor.getNumberOfStudents();
				
				if (tutor.getTotalPay() > highestPay) {
					highestPay = tutor.getTotalPay();
					highestPaidTutor = tutor.getName();
				}
				if (tutor.getTotalPay() < lowestPay) {
					lowestPay = tutor.getTotalPay();
					lowestPaidTutor = tutor.getName();
				}
			}
			
			System.out.println("Total Pay (All Tutors): $" + String.format("%.2f", grandTotalPay));
			System.out.println("Total Classes (All Tutors): " + totalClasses);
			System.out.println("Total Students (All Tutors): " + totalStudents);
			System.out.println("Average Pay per Tutor: $" + String.format("%.2f", grandTotalPay / tutors.size()));
			System.out.println("Highest Paid Tutor: " + highestPaidTutor + " - $" + String.format("%.2f", highestPay));
			System.out.println("Lowest Paid Tutor: " + lowestPaidTutor + " - $" + String.format("%.2f", lowestPay));
		}
		
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
	
	// Helper class to store tutor information
	static class TutorInfo {
		private String name;
		private int numberOfClasses;
		private int numberOfStudents;
		private double payPerClass;
		private double payPerStudent;
		private double totalPay;
		private double averagePayPerClass;
		private double averagePayPerStudent;
		
		public TutorInfo(String name, int numberOfClasses, int numberOfStudents,
		                double payPerClass, double payPerStudent, double totalPay,
		                double averagePayPerClass, double averagePayPerStudent) {
			this.name = name;
			this.numberOfClasses = numberOfClasses;
			this.numberOfStudents = numberOfStudents;
			this.payPerClass = payPerClass;
			this.payPerStudent = payPerStudent;
			this.totalPay = totalPay;
			this.averagePayPerClass = averagePayPerClass;
			this.averagePayPerStudent = averagePayPerStudent;
		}
		
		// Getters
		public String getName() { return name; }
		public int getNumberOfClasses() { return numberOfClasses; }
		public int getNumberOfStudents() { return numberOfStudents; }
		public double getPayPerClass() { return payPerClass; }
		public double getPayPerStudent() { return payPerStudent; }
		public double getTotalPay() { return totalPay; }
		public double getAveragePayPerClass() { return averagePayPerClass; }
		public double getAveragePayPerStudent() { return averagePayPerStudent; }
	}
}
