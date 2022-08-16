package Day3;

import java.util.Scanner;

public class EmployeeWageComputation {
	//constants
	private static boolean isFullTime = false;
	public static int wagePerHour=20;
	public static int fullDayHour=8;
	public static int partTimeHour=fullDayHour/2;
	public static int dayOfmonth=20;
	public static void  uc1() {
		int a = (int) ((Math.random())*10)%2;
		if(a==1) {
			System.out.println("Employee present");
		}
		else {
			System.out.println("Employee absent");
		}
	}
	public static void uc2( boolean x) {
		if (x) {
			int empWage = (wagePerHour*fullDayHour);
			System.out.println("Full time employee wage is "+ empWage);
		}
		else {
			System.out.println("-");
		}
		
	}
	public static void uc3( boolean x) {
		if (x) {
			int empWage = (wagePerHour*fullDayHour);
			System.out.println("Full time employee wage is "+ empWage);
		}
		else {
			int empWage = (wagePerHour*partTimeHour);
			System.out.println("Part time employee wage is "+ empWage);
		}
		
	}
	public static void uc4(boolean x) {
		if (x) {
			System.out.println();
			int empWage = (wagePerHour*fullDayHour*dayOfmonth);
			System.out.println("Full time employee wage for a month is "+ empWage);
			}
		else {
			int empWage = (wagePerHour*partTimeHour*dayOfmonth);
			System.out.println("Part time employee wage for a month is "+ empWage);
		}
	}
	public static void uc5(boolean x) {
		if (x) {
			System.out.println();
			int empWage = (wagePerHour*100);
			System.out.println("Full time employee wage for a month i.e 100hrs is "+ empWage);
			}
		else {
			int empWage = (wagePerHour*partTimeHour*dayOfmonth);
			System.out.println("Part time employee wage for a month is "+ empWage);
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage calculator");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.println(" Enter 0 : for Part time employee ");
		System.out.println(" Enter 1 : for Full time employee ");
		byte x = sc.nextByte() ;
		if (x==0) {
			boolean isFullTime = false;
		}
		else if (x==1) {
			boolean isFullTime = true;
		}
		else {
			System.out.println("invalid");
		}
		System.out.println(" 1: Employee present or absent");
		System.out.println(" 2: Full time Wage calculation");
		System.out.println(" 3: Full \\ Part time wage calculation");
		System.out.println(" 4: Calculate wage for a month");
		System.out.println(" 5: Calculate wage for a month with condition");
		byte key = sc.nextByte();
		
		switch (key) {
		case 1 : 	uc1();	          // Employee present or absent
			break;
		case 2 : 	uc2(isFullTime);  //  Full time Wage calculation	
			break;
		case 3 :	uc3(isFullTime);  // Full \ Part time wage calculation
			break;
		case 4 : 	uc4(isFullTime);  // Calculate wage for a month
			break;
		case 5 : 	uc5(isFullTime);  //Calculate wage for a month with condition
			break;
		default:    System.out.println("invalid");
			}	
	}
}
