package com.cubic.assignment.demo;

import java.util.Scanner;

public class Fan {
	
	final static int YEAR1=1;
	final static int YEAR2=2;
	final static int YEAR3=3;
	final static int YEAR4=4;
	final static int YEAR5=5;
    int AcademicYear;
	public static void main(String[] args) {
		
		//Fan fg=new Fan();		
		Scanner input=new Scanner(System.in);// as a whole constructor and Scanner(System.in) is parametrized constructor and helps in creating a object (scan) 
		
		int AcademicYear= input. nextInt();
		input.close();
		System.out.println("Enter your academic year");
		
		switch (AcademicYear){
		case YEAR1:
		System.out.println("You are a freshman");
		
			break;
		case YEAR2:
			System.out.println("You are a sophomore"); 
			break;
		case YEAR3:
			System.out.println("You are a junior"); 
						break;
		case YEAR4:
			
				System.out.println("You are a senior"); 
			break;
		case YEAR5:
			
				System.out.println("You are a graduate"); 
			break;
			default:
				System.out.println("Invalid"); 
		}
	}
}
			


