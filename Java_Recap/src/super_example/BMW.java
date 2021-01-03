package super_example;

public class BMW extends Car{
	
	BMW(){
		// Parent class constructor is called automatically when child class constructor is called.
		super();
		System.out.println("Calling BWM constructor.");
	}

	String name = "BMW";
	
	public void getName() {
		System.out.println("Current class name " + name + ".");
		System.out.println("Super class name " + super.name + ".");
	}
	
	@Override
	public void startCar() {
		System.out.println("BMW is starting.");
		super.startCar();
	}
	
	public static void main(String[] args) {
		
		
		BMW bmw = new BMW();
		bmw.getName();
		bmw.startCar();
		
		
	}
	
	
}
