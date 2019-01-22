package HibernateAssignment.MyAssignment;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;

import org.hibernate.*;
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
    	//insert
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session session=factory.openSession(); 
        session.beginTransaction();
    	Student obj=new Student();
    	obj.setStudentAge(21);
        obj.setStudentName("Ankita");
        session.save(obj);
        Integer id=(Integer)session.save(obj);
        System.out.println(id);
        session.getTransaction().commit();
		/*
		 *  System.out.println(
		 * "Hello World !" ); // new Configuration().configure().buildSessionFactory();
		 * SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 * // EntityManager entityManager=factory.createEntityManager(); Session
		 * session=factory.openSession(); session.beginTransaction(); Student obj=new
		 * Student();
		 */
       // cc
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
