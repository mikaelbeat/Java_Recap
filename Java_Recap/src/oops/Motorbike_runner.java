package oops;

public class Motorbike_runner {

	public static void main(String[] args) {
		
		Motorbike ducati = new Motorbike(50);
		Motorbike honda = new Motorbike(10);
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(40);
		System.out.println("Ducati speed is " + ducati.getSpeed());
		ducati.increaseSpeed(10);
		System.out.println("Ducati speed is " + ducati.getSpeed());
		ducati.decreaseSpeed(60);
		System.out.println("Ducati speed is " + ducati.getSpeed());
		
		honda.setSpeed(100);
		System.out.println("Honda speed is " + honda.getSpeed());
	}

}
