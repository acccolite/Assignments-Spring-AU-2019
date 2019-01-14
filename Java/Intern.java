package com.accolite.practicenew;

public class Intern extends Manager{
	
	
	static {
		 System.out.println("Welcome to Intern profile of the organization");
	}


	{
		 System.out.println("In the non-static block of Intern");
	}
	public static void main(String[]args) {
		
		int hike=2;
		int empno=4003;
		String name="Abhishek";
		double salary=15000;

		Intern inObj=new Intern();
		inObj.employ_data(empno,name,salary);
		System.out.println("Designation="+inObj.getDesignation(empno));
		
	}
	
}
