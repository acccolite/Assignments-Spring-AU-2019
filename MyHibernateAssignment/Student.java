package HibernateAssignment.MyAssignment;

import java.util.List;

import javax.persistence.*;




@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="studentId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer studentId;

	@Column(name="studentName")
	public String studentName;

	@Column(name="studentAge")
	public Integer studentAge;

	/*
	 * @OneToMany(mappedBy="studentId", fetch=FetchType.EAGER) public List<Course>
	 * courses;
	 */
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	/*
	 * @OneToMany(mappedBy="studentId", fetch=FetchType.EAGER) public
	 * List<Course>courses;
	 * 
	 * 
	 * public List<Course> getCourses() { return courses; }
	 * 
	 * public void setCourses(List<Course> courses) { this.courses = courses; }
	 */
	
	
	
	
}
