package com.accolite.practicenew;

public class Manager extends Employees{
public static void main(String []args) {
	int hike=5;
	int empno=4002;
	String name="Rahul";
	double salary=20000;
	Manager m=new Manager();
	m.employ_data(empno,name,salary);
	System.out.println("Designation="+m.getDesignation(empno));
	System.out.println("New salary after a salary hike of "+ hike +"% is "+raiseSalary(salary,hike));
}

static {
	 System.out.println("Welcome to Manager profile of the organization");
}


{
	 System.out.println("In the non-static block of Manager");
}

public static double raiseSalary(double salary,double raise) {
	double res=salary+salary*(raise/100);
	return res;
}

public String getDesignation(int empno) {
	String des="";
	switch(empno) {
	case 4002:des= "Manager";
	break;
	case 4003:des= "Intern";
	break;
	}
	return des;
	
}

}
