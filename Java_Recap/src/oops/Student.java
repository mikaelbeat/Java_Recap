package oops;

public class Student {
	
	private String name;
	private int studentID;
	

	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return this.name;
	}
	
	public int getStudentID() {
		return this.studentID;
	}
	
	
	public void enrollClass(String enrolledClass) {
		System.out.println(this.name + " enrolled class " + enrolledClass + ".");
	}
	
	
	

	public static void main(String[] args) {
		
		Student demo = new Student("Demo", 12345);
		System.out.println("Student name is " + demo.getStudentName() + ".");
		System.out.println("Student id is " + demo.getStudentID() + ".");
		demo.enrollClass("Arts");

	}

}
