package MyAssignment.PercentileRanking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadStudentDetails {
	
public StudentDao dao;
	
	public StudentDao getDao() {
		return dao;
	}
	
	public void setDao(StudentDao dao) {
		this.dao=dao;
	}

	public ArrayList<Student> getStudentDetails(){
		
	ArrayList <Student> studentList=new ArrayList<Student>();	
	 String studentFile = "C:\\Users\\ankita.srivastava\\Desktop\\StudentDetails.txt";
	 String marksFile = "C:\\Users\\ankita.srivastava\\Desktop\\MarksDetails.txt";
	 BufferedReader br1 = null;
	 BufferedReader br2 = null;
	 String line1 = "";
	 String line2 = "";
	 String splitBy = ",";
	String str1[];
	String str2[];
	
	try {
	     br1 = new BufferedReader(new FileReader(studentFile));
	     br2 = new BufferedReader(new FileReader(marksFile));
	     while ((line1 = br1.readLine()) != null&&(line2 = br2.readLine()) != null) {

	         // use comma as separator
	          str1 = line1.split(splitBy);
	          str2 = line2.split(splitBy);
	          Student student=new Student((str1[0]),(str1[1]),(str1[2]),(str2[1]),
	        		  (Integer.parseInt(str2[2])),(Integer.parseInt(str2[3])),(Integer.parseInt(str2[2]))+(Integer.parseInt(str2[3])));
	          
				/*
				 * student.setStudentName(str1[0]); student.setStudentId(str1[1]);
				 * student.setStudentDOB(str1[2]); System.out.println("inserted");
				 * student.setStudentSubject(str2[1]);
				 * student.setStudentMarks1(Integer.parseInt(str2[2]));
				 * student.setStudentMarks2(Integer.parseInt(str2[3]));
				 * student.setTotalMarks(student.getStudentMarks1()+student.getStudentMarks2());
				 */
	         //System.out.println(student.getStudentName()+"->"+student.getStudentId()+"->"+student.getStudentDOB());
	         studentList.add(student);
	        

	     }
	     
	    
	     
}
	     catch (FileNotFoundException e) {
	         e.printStackTrace();
	     } catch (IOException e) {
	         e.printStackTrace();
	     } finally {
	         if (br1 != null) {
	             try {
	                 br1.close();
	             } catch (IOException e) {
	                 e.printStackTrace();
	             }
	         }
	         if (br2 != null) {
	             try {
	                 br2.close();
	             } catch (IOException e) {
	                 e.printStackTrace();
	             }
	         }
	     }
	    
	 
return studentList;
}
}