package oopHomework;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kurs eklendi : "+course.name);
	}
	public void update(Course course) {
		System.out.println("Kurs G�ncellendi : "+course.name);
	}
	public void removeCourse(Course course) {
		System.out.println("Kurs Kald�r�ld� : "+course.name);
	}
}
