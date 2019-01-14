package com.accolite.practicenew;

import java.util.Collections;

import java.util.Comparator;

import java.util.LinkedList;

import java.util.List;

import java.util.Scanner;

public class Company extends NewCompany{

public static void main(String[] args) {

		int n;

		Scanner in = new Scanner(System.in);

		
       	System.out.println("Enter the number of companies: ");
       	n=in.nextInt();

		Company noOfCompanies[]=new Company [n];

			for(int i=0;i<n;i++)

			{

			noOfCompanies[i]=new Company();

			}

			for (int i=0;i<n;i++)

			{

				String area;

				String city;

				int no_emp;

				String emp_name;

				int emp_id;

				int emp_age;

			

				

				System.out.println("Enter name of company: ");

				String l=in.nextLine();

				noOfCompanies[i].setCompanyname(l);

				

				System.out.println("Enter the area of company: ");

				area = in.nextLine();

				

				System.out.println("Enter the city of the company: ");

				city = in.nextLine();

				

				noOfCompanies[i].setAddress(area, city);

				

				

				System.out.print("Details of the company-->");

				System.out.println(noOfCompanies[i].CompanyName);

				System.out.println(noOfCompanies[i].address.city);

				System.out.println(noOfCompanies[i].address.street);

				

				noOfCompanies[i].Employee=new LinkedList<>();

				System.out.println("Enter the number of employees: ");

				no_emp=in.nextInt();

				for(int j=0;j<no_emp;j++)

				{

					System.out.println("Employee name-- ");

					emp_name = in.next();

					System.out.println("Employee id-- ");

					emp_id=in.nextInt();

					System.out.println("Employee Age-- ");

					emp_age=in.nextInt();

					noOfCompanies[i].Employee.add(new Employee(emp_name,emp_id,emp_age));

				}

			}

			

	for(int k=0;k<n;k++)

	{

	         System.out.println(" ");

	         System.out.println("Sorting of Employees Based on Age");

			 Collections.sort(noOfCompanies[k].Employee,new salary());

	      for(Employee q:noOfCompanies[k].Employee)

	         {

	                 System.out.println(q.toString());

			 }

			         System.out.println(" ");

	                 System.out.println("Employees Sorted Based on Names");

	                 Collections.sort(noOfCompanies[k].Employee, new NameSort());

	      for(Employee w:noOfCompanies[k].Employee)

	         {

		            System.out.println(w.toString());

	         }

	                System.out.println(" ");

	                System.out.println(" Employees whose age is less than 30");

		  for(Employee m:noOfCompanies[k].Employee)

		  {

		      if ( m.emp_age < 30)

		           {

		            	

			            System.out.println(m.toString());

		     	

		           }

		    }

		  

		  

		}

		

		

			

			}

		}


class Employee {

	String emp_name;

	int emp_age;

	int emp_id;

	

	public Employee(String emp_name,int emp_id, int emp_age)

	{

		this.emp_name=emp_name;

		this.emp_age=emp_age;

		this.emp_id=emp_id;

	}

	public String getEmployname() {

		return emp_name;

	}

	public int getId() {

		return emp_id;

	}

	public int getAge() {

		return emp_age;

	}

	public String toString(){

        return "Name--> "+this.emp_name+"   Age--> "+this.emp_age;
        

    }

	



}


 class NewCompany {

	String CompanyName;

	List<Employee> Employee;

	Address address;

	public String getCompanyname() {

		return CompanyName;

	}

	public void setCompanyname(String CompanyName) {

		this.CompanyName = CompanyName;

	}

	

	public void setAddress(String s,String c) {

		this.address=new Address();

		this.address.street = s;

		this.address.city=c;

	}

	

	



}

 

 class Address {

	String street;

	String city;

	

	



}

 class salary implements Comparator<Employee>{

	 

	    @Override

	    public int compare(Employee e1, Employee e2) {

	        if(e1.getAge() > e2.getAge()){

	            return 1;

	        } else {

	            return -1;

	        }

	    }

	}

 class NameSort implements Comparator<Employee> 

 {

     

     public int compare(Employee a, Employee b) 

     { 

         return a.emp_name.compareTo(b.emp_name); 

     } 

 } 

