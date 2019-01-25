package MyAssignment.PercentileRanking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class StudentRankList {
	
	public ArrayList<Student>getStudentRankList(ArrayList<Student>studentList){
		
			
			
			Collections.sort(studentList, new Comparator<Student>(){
			    public int compare(Student s1, Student s2) {
			    	Integer i1=new Integer(s1.getTotalMarks());
			    	Integer i2=new Integer(s2.getTotalMarks());
			    	if(Integer.compare(i1, i2)==0) {
			    		
			    		String dateOfBirth1=s1.getStudentDOB();  
			    		String dateOfBirth2=s2.getStudentDOB(); 
			    	    try {
							Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth1);
							
							Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth2);
							return date1.compareTo(date2);
							
							
						} catch (ParseException e) {
							
							e.printStackTrace();
						}
			    	}
			    	
			    	
			        return i2.compareTo(i1);
			    }
			});
			
			
			
			 for(Student s: studentList){
				 System.out.println("sorted");
				 System.out.println(s.getStudentName()+"->"+s.getStudentId()+"->"+s.getStudentDOB()+s.getStudentSubject()+"->"+s.getStudentMarks1()+"->"+s.getStudentMarks2()+"->"+s.getTotalMarks());
				
			   }
			return studentList;
		
	}

}
