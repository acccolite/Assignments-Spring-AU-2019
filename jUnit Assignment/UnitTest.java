package MyAssignment.PercentileRanking;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class UnitTest {
	
	public ApplicationMain applicationMain;
	public ReadStudentDetails readStudentDetails;
	public StudentRankList studentRankList;
	public WriteToFile writeToFile;
	public StudentDao dao;
	
	@Before
	public void setup() {
		readStudentDetails=new ReadStudentDetails();
		dao=Mockito.mock(StudentDao.class);
		readStudentDetails.setDao(dao);
		
	
	}
	@After
	public void tearDown() {
		readStudentDetails=null;
		dao=null;
	}
	
	@Test
	public void testGetStudentDetails(){
		ArrayList <Student> students=new ArrayList<Student>();

		students.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		/*
		 * students.get(0).setStudentName("Rahul");
		 * students.get(0).setStudentId("1001");
		 * students.get(0).setStudentDOB("16/06/1997");
		 * students.get(0).setStudentSubject("Hibernate");
		 * students.get(0).setStudentMarks1(91); students.get(0).setStudentMarks2(99);
		 */
		//students.get(0).setTotalMarks(190);
		//Mockito.when(dao.getStudents()).thenReturn(students);
		/*
		 * private String studentName; private String studentId; private String
		 * studentDOB; private String studentSubject; private int studentMarks1; private
		 * int studentMarks2; private int totalMarks;
		 */
		//List <Student> list=readStudentDetails.getStudentDetails();
		assertEquals("Rahul",students.get(0).getStudentName());
		assertEquals("1001",students.get(0).getStudentId());
		assertEquals("16/06/1997",students.get(0).getStudentDOB());
		assertEquals("Hibernate",students.get(0).getStudentSubject());
		assertEquals(91,students.get(0).getStudentMarks1());
		assertEquals(99,students.get(0).getStudentMarks2());
		assertEquals(190,students.get(0).getTotalMarks());
		//Mockito.verify(dao,Mockito.times(6)).notifyStudent(Mockito.any(Student.class));
	}
	
	@Test
	public void testGetStudentRankList() {
		ArrayList <Student> students=new ArrayList<Student>();
		
		students.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		students.add(new Student("Ankita","1002","29/08/2007","Hibernate",92,98,190));
		
		studentRankList=new StudentRankList();
		ArrayList<Student> result=studentRankList.getStudentRankList(students);
		//students.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		ArrayList<Student> actual=new ArrayList<Student>();
		
		actual.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		actual.add(new Student("Ankita","1002","29/08/2007","Hibernate",92,98,190));
		assertEquals(students,result);
		
		
		
	}
	@Test
	public void testReadStudentDetails() {
		applicationMain=new ApplicationMain();
ArrayList <Student> students=new ArrayList<Student>();
		
		students.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		students.add(new Student("Ankita","1002","29/08/2007","Hibernate",91,66,157));
		ArrayList<Student> result=applicationMain.readStudentDetails();
		
		assertEquals(students,result);

		
		
	}
	
	@Test
	public void testGetRankList() {
		applicationMain=new ApplicationMain();
ArrayList <Student> students=new ArrayList<Student>();
		
		students.add(new Student("Rahul","1001","16/06/1997","Hibernate",91,99,190));
		students.add(new Student("Ankita","1002","29/08/2007","Hibernate",91,66,157));
		ArrayList<Student> result=applicationMain.getRankList(students);
		
		assertEquals(students,result);

		
		
	}
	
	@Test
	public void testWriteToFile() {
		writeToFile=new WriteToFile();
		
		
	}
	
}
