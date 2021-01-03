package oops;

public class Motorbike {
	
	private int speed;
	
	
	Motorbike() {
		// Using example this(5)
		// Another constructor can be called
	}
	
	Motorbike(int speed){
		this.speed = speed;
	}
	
	
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		} else {
			System.out.println("Speed must be 0 or more.");
		}
		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void start() {
		System.out.println("Bike started!");
	}
	
	public void increaseSpeed(int amount) {
		setSpeed(this.speed + amount);
	}
	
	public void decreaseSpeed(int amount) {
		setSpeed(this.speed - amount);
	}	

}
