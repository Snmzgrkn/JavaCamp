package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Engin Demirog","deneme@gmail.com","123456", "Yazılım Geliştirme Kampı (JAVA+React)");
		
		Student student = new Student("Gürkan Sönmez","deneme1@gmail.com","123456","100000");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		
		userManager.signIn(instructor);
		userManager.signIn(student);
		
		instructorManager.addCourse(instructor);;
		studentManager.takeCourse(student);
		
		

	}

}
