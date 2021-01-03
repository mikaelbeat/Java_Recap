package abstract_example;

// Abstract class must be extended and methods implemented
abstract public class Shape {
	
	abstract public void displayShape();
	
	public void displayName() {
		System.out.println("From abstract class.");
	}

}
