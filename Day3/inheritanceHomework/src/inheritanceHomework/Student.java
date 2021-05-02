package inheritanceHomework;

public class Student extends User {
	private String studentNumber;
	
	public Student(String name, String email, String password, String studentNumber) {
		super(name, email, password);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	

}
