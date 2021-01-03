package abstract_example;

public class Triangle extends Shape{


	@Override
	public void displayShape() {
		System.out.println("Triangle");
		
	}
	
	
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Triangle();
		
		s1.displayShape();
		s2.displayShape();

	}

}
