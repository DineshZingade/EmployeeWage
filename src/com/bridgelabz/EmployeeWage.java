package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] arr) {
		int empIsPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (empIsPresent == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

	}

}
