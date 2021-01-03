package training;

public class Polymorphism_overloading {

	public static void main(String[] args) {
		
		
		addValues(5, 5);
		addValues("Cat", "Dog");

	}
	
	
	
	
	public static void addValues(int value1, int value2) {
		int result = value1 + value2;
		System.out.println("Result is " + result + ".");
	}
	
	
	public static void addValues(String value1, String value2) {
		String result = value1 + value2;
		System.out.println("Result is " + result + ".");
	}

}
