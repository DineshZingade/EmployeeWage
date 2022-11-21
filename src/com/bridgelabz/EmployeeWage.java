package com.bridgelabz;

public class EmployeeWage {
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	int wagePerHour;
	int fullDayHour;
	int partTimeHour;
	int workingDayPerMonth;
	int totalWorkingHours;
	int workingHoursPerMonth;

	public EmployeeWage(int wagePerHour, int fullDayHour, int partTimeHour, int workingDayPerMonth,
			int workingHoursPerMonth) {
		this.wagePerHour = wagePerHour;
		this.fullDayHour = fullDayHour;
		this.partTimeHour = partTimeHour;
		this.workingDayPerMonth = workingDayPerMonth;
		this.totalWorkingHours = totalWorkingHours;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	public void calculateWage() {
		int workingDays = 0;
		int totalWage = 0;
		while (workingDays < workingDayPerMonth && totalWorkingHours < workingHoursPerMonth) {
			int empPresent = (int) (Math.floor(Math.random() * 10) % 3); // number b/w 0 and 1
			int empWage = 0;
			if (empPresent == IS_PART_TIME) {
				System.out.println("Part time");
			} else if (empPresent == IS_FULL_TIME) {
				System.out.println("Full time");
			} else if (empPresent == 0) {
				System.out.println("Absent");
			}
			switch (empPresent) {
			case IS_PART_TIME:

				if (totalWorkingHours + partTimeHour <= workingHoursPerMonth) {
					empWage = wagePerHour * partTimeHour;
					totalWorkingHours = totalWorkingHours + partTimeHour;
				}
				break;
			case IS_FULL_TIME:

				if (totalWorkingHours + fullDayHour <= workingHoursPerMonth) {
					empWage = wagePerHour * fullDayHour;
					totalWorkingHours = totalWorkingHours + fullDayHour;
				}
				break;
			default:
				empWage = 0;
			}
			totalWage = totalWage + empWage;
			System.out.println("Total Wage for Day " + (workingDays + 1) + " = " + totalWage);
			workingDays++;
		}
		System.out.println("Total Working Days :" + workingDays);
		System.out.println("Total Working Hours :" + totalWorkingHours);
		System.out.println("Employee Wage :" + totalWage);
	}

	@Override
	public String toString() {
		return "EmployeeWage{" + "wagePerHour=" + wagePerHour + ", fullDayHour=" + fullDayHour + ", partTimeHour="
				+ partTimeHour + ", workingDayPerMonth=" + workingDayPerMonth + ", totalWorkingHours="
				+ totalWorkingHours + ", workingHoursPerMonth=" + workingHoursPerMonth + '}';
	}

	public static void main(String[] args) {
		EmployeeWageBuilder.createEmployeeWage();
		// System.out.println(EmployeeWageBuilder.arrayList);
		for (EmployeeWage employeeObject : EmployeeWageBuilder.arrayList) {
			System.out.println(employeeObject);
		}
	}

}