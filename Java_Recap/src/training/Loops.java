package training;

public class Loops {

	public static void main(String[] args) {
		
		int[] data = {1, 2, 3, 4, 5};
		
		for(int value : data) {
			System.out.println("Value is " + (value));
		}
		
		for(int i=0; i < data.length; i++) {
			System.out.println((data[i]));
		}
		
		int day = 3;
		
		switch (day) {
		case 1:
			System.out.println("It is monday!");
			break;
		case 2:
			System.out.println("It is tuesday!");
			break;
		case 3:
			System.out.println("It is wednesday!");
			break;
		default:
			System.out.println("It is weekend!");
			break;
		}
		
		
		int value = 1;
		
		while(value <= 5) {
			System.out.println("Hi!");
			value+=1;
		}
		


	}

}
