package com.empoops;
import java.util.Random;

public class EmpOops {

	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Builder");
		 int IS_FULL_TIME = 1;

	     
	     Random r = new Random();
	     int empCheck =  r.nextInt(2) ;
	     
	     if(empCheck == IS_FULL_TIME)
	             System.out.println("Employee is Present");
	     else
	    	     System.out.println("Employee is Absent");
		}
	
}
