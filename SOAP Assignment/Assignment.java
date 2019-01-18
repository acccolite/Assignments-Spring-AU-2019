import java.util.*;

public class Assignment {
	static ArrayList <Employee> emp=new ArrayList<Employee>(); 
	String v;
	int h;
     public String addEmployee(String name,int age,int id) {
    	 emp.add(new Employee(name,age,id));
    	 return "Added new Employee";
     }
     
 
     
     public  String showemployee(int k)
 	{
 		for(Employee e1:emp)
 		{
 			if(e1.getId()==k)
 			{
 				 v=e1.getName();
 			     h=e1.getAge();
 				break;
 			}
 				
 			return "Data not found";
 		}
 		return "Name:"+v+"Age:"+h;
 		
 		
 	}
     public String updateemployee(int k,String l,int m)
 	{
 		for(Employee e1:emp)
 		{
 			if(e1.getId()==k)
 			{
 				e1.setName(l);
 				e1.setAge(m);
 				break;
 				
 			}
 				
 			return "Data not found";
 		}
 		return "Found and updated";
 	}
     
     public String deleteEmployee(int k)
     {
    	 for(Employee e1:emp)
  		{
  			if(e1.getId()==k&&(emp.size()!=0))
  			{
  				 
  			     emp.remove(e1);
  			   return "Data Deleted";
  			}
  				
  			
  		}
    	 return "Data not found";
     }
     
     public String getAll() {
    	 String res="";
    	 for(Employee e1:emp) {
    		 res+=e1.getName();
    		 res+="   ";
    	 }
    	 return res;
    	 
     }
     
     
     
}
