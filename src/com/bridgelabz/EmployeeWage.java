package com.bridgelabz;

public class EmployeeWage {
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HOUR = 8;

	public static void main(String[] args) {

		int empIsPresent = (int) (Math.floor(Math.random() * 10) % 2);
		int empWage = 0;
		if (empIsPresent == 1) {
			System.out.println("Employee is Present");
			empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
		} else {
			System.out.println("Employee is Absent");
		}
		System.out.println("Employee Wage:" + empWage);
	}

}