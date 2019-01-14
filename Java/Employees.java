package com.accolite.practicenew;

public class Employees {
	
      
    
    
	 
	 public void employ_data(int empno,String name,double salary)
	    {
	        System.out.println("\nEmployee no.="+empno);  
	        System.out.println("Name="+name);
	        System.out.println("Salary="+salary);
	    }
	 
	 static {
		 System.out.println("Welcome to Employees section of the organization");
	 }
	 
	 {
		 System.out.println("In the non-static block of Employee");
	 }

	public static void main(String[]args) {
		 
	   Employees obj=new Employees();
	   obj.employ_data(4001,"Ankita",40000);
	   

}
}
