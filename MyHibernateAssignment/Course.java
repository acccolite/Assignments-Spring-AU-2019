package HibernateAssignment.MyAssignment;

import javax.persistence.*;

@Entity
	@Table(name="courses")
	public class Course {

		@Id
		@Column(name="courseId")
		@GeneratedValue(strategy=GenerationType.AUTO)
		public Integer courseId;

		@Column(name="courseName")
		public String courseName;

		@Column(name="studentId")
		public Integer studentId;


		
		public Integer getCourseId() {
			return courseId;
		}

		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Integer getStudentId() {
			return studentId;
		}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}
		
		

	}



