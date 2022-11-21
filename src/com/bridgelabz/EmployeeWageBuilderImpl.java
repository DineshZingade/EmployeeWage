package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageBuilderImpl implements EmployeeWageBuilder {
	static ArrayList<EmployeeWage> arrayList = new ArrayList();

	public void createWageBuilder() {
		EmployeeWage emp = new EmployeeWage(20, 10, 5, 22, 90);
		emp.calculateWage();
		EmployeeWage emp1 = new EmployeeWage(22, 9, 4, 20, 88);
		emp1.calculateWage();
		EmployeeWage emp2 = new EmployeeWage(21, 8, 4, 20, 80);
		emp2.calculateWage();
		arrayList.add(emp);
		arrayList.add(emp1);
		arrayList.add(emp2);
	}
}
