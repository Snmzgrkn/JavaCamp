package oopHomework;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Kampý (C# + ANGULAR)", "Engin Demiroð", "Ücretsiz");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Kampý (JAVA + REACT)", "Engin Demiroð", "Ücretsiz");
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð", "Ücretsiz");
		
		Course[] courses = {course1,course2,course3};

		for (Course course : courses) {
			
			System.out.println(course.name);
			
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Programlama";
	
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		
	}
}
