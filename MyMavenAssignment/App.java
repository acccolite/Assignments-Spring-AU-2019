package myProject.newProject;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;//second level of cache
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Student>studentList= new ArrayList<Student>();
    	List<Course>courseList= new ArrayList<Course>();
    	
    	
    	//insert
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session session=factory.openSession(); 
		/*
		 * session.beginTransaction(); Student obj=new Student(); obj.setStudentAge(35);
		 * obj.setStudentName("Abhishek"); session.save(obj); Integer
		 * id=(Integer)session.save(obj); System.out.println("Student id= "+id);
		 * session.getTransaction().commit();
		 * 
		 * 
		 * SessionFactory factory1=new
		 * Configuration().configure().buildSessionFactory(); Session
		 * session1=factory.openSession(); session1.beginTransaction(); Course obj1=new
		 * Course(); obj1.setCourseId(1); obj1.setCourseName("Hibernate");
		 * session1.save(obj1); Integer courseid=(Integer)session1.save(obj1);
		 * System.out.println("course id= "+courseid);
		 * session1.getTransaction().commit();
		 */
    	//retrieve
        
        Criteria cr=session.createCriteria(Student.class);
		 cr.add(Restrictions.gt("studentAge", 30)); 
		 studentList= cr.list();
		 System.out.println("Student name= "+studentList.get(0).getStudentName());
		 
		
		  Criteria cr1=session.createCriteria(Course.class);
		  cr1.add(Restrictions.gt("courseId", 1)); 
		  courseList= cr1.list();
		  System.out.println("course name ="+courseList.get(0).getCourseName());
		 
		
		  for(Student student: studentList) { System.out.println(
		  student.getStudentName()+"|" +student.getStudentAge()+"|"
		  +student.getStudentId()+"|"
		  +(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
		  :"") ); }
		 
		 
		/*
		 *  System.out.println(
		 * "Hello World !" ); // new Configuration().configure().buildSessionFactory();
		 * SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 * // EntityManager entityManager=factory.createEntityManager(); Session
		 * session=factory.openSession(); session.beginTransaction(); Student obj=new
		 * Student();
		 */
       // obj.setStudentAge(21);
       // obj.setStudentName("Ankita");
		/*
		 * session.save(obj); Integer id=(Integer)session.save(obj);
		 * System.out.println(id); session.getTransaction().commit();
		 */
        
		/*
		 * SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 * Session session=factory.openSession(); session.beginTransaction(); Criteria
		 * cr=session.createCriteria(Student.class);
		 * cr.add(Restrictions.gt("studentAge", 18)); studentList= cr.list();
		 */
		 // System.out.println(studentList.get(0).getStudentName());
		 
    	
    	 
		/*
		 * Course course =new Course(); course.setCourseName("Hibernate");
		 * course.setStudentId(200); session.save(course);
		 * session.getTransaction().commit();
		 * 
		 * Integer id=(Integer)session.save(course); // System.out.println(id);
		 */		  
		/*
		 * for(Student student: studentList) { System.out.println(
		 * student.getStudentName()+"|" +student.getStudentAge()+"|"
		 * +student.getStudentId()+"|"
		 * +(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
		 * :"") ); }
		 */
		  
		  
		  
		  
    }
}
