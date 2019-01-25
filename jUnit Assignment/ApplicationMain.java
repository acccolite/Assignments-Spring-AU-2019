package MyAssignment.PercentileRanking;

import java.io.FileWriter;
import java.util.ArrayList;


public class ApplicationMain {
	

	
	public static void main(String[]args) {
		ApplicationMain object=new ApplicationMain();
		
		ArrayList <Student> studentList=new ArrayList<Student>();
		ArrayList <Student> rankList=new ArrayList<Student>();
		studentList=object.readStudentDetails();
		
		for(Student s:studentList) {
			
			System.out.println(s.getStudentName()+"->"+s.getStudentId()+"->"+s.getStudentDOB()+s.getStudentSubject()+"->"+s.getStudentMarks1()+"->"+s.getStudentMarks2()+"->"+s.getTotalMarks());
		}
		
		rankList=object.getRankList(studentList);
		
		try{    
	          FileWriter outputFile=new FileWriter("C:\\Users\\ankita.srivastava\\Desktop\\OutputFile.txt");
	          for(Student s:rankList) {
	          outputFile.write(s.getStudentName()+"->"+s.getTotalMarks()+"\n");  }  
	          outputFile.close();    
	         }catch(Exception e){System.out.println(e);}    
	         System.out.println("Success...");    
	    }    
	
		
		
	
	
	
	
	public ArrayList<Student> readStudentDetails(){
		ReadStudentDetails studentDetails=new ReadStudentDetails();
		System.out.println("done");
		return studentDetails.getStudentDetails();
	}
	
	public ArrayList<Student>getRankList(ArrayList<Student>studentList){
		StudentRankList studentRankList=new StudentRankList();
		return studentRankList.getStudentRankList(studentList);
	}
	
	
	
	
	
	

}
