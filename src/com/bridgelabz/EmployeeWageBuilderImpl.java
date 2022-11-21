package com.bridgelabz;

import java.util.ArrayList;

public class EmployeeWageBuilderImpl implements EmployeeWageBuilder {
	static ArrayList<EmployeeWage> arrayList = new ArrayList();

	public int getTotalWage(String companyName) {
		int totalWage = 0;
		for (EmployeeWage employeeObject : EmployeeWageBuilderImpl.arrayList) {
			if (companyName.equals(employeeObject.companyName)) {
				totalWage = employeeObject.totalWage;
			}
		}
		return totalWage;
	}

}
