package training;

public class Arrays {

	public static void main(String[] args) {
		
		int array1[] = new int[5];
		
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		
		System.out.println(array1[1]);
		
		for(int i=0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		
		int array2[] = {10, 20, 30, 40};
		
		for(int value : array2) {
			System.out.println(value);
		}

	}

}
