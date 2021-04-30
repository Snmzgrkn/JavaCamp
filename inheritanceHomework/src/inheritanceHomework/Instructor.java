package inheritanceHomework;

public class Instructor extends User{
	String courseName;
	
	

	public Instructor(String name, String email, String password, String courseName) {
		super(name, email, password);
		this.courseName = courseName;
	}

	
}
