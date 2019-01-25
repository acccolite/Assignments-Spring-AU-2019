package MyAssignment.PercentileRanking;

public class Student implements Comparable{
	
	private String studentName;
	private String studentId;
	private String studentDOB;
	private String studentSubject;
	private int studentMarks1;
	private int studentMarks2;
	private int totalMarks;
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	public int getStudentMarks1() {
		return studentMarks1;
	}
	public Student(String studentName, String studentId, String studentDOB, String studentSubject, int studentMarks1,
			int studentMarks2, int totalMarks) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentDOB = studentDOB;
		this.studentSubject = studentSubject;
		this.studentMarks1 = studentMarks1;
		this.studentMarks2 = studentMarks2;
		this.totalMarks = totalMarks;
	}
	public void setStudentMarks1(int studentMarks1) {
		this.studentMarks1 = studentMarks1;
	}
	public int getStudentMarks2() {
		return studentMarks2;
	}
	public void setStudentMarks2(int studentMarks2) {
		this.studentMarks2 = studentMarks2;
	}
	
	public int compareTo(Student student) {
		  int compareMarks=((Student)student).getTotalMarks();
	        /* For Ascending order*/
	        return this.totalMarks-compareMarks;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
