package training;

public class PassArrayMethod {

	
	public void findMin(int ar[]) {
		int min = ar[0];
		
		for(int i=0; i < ar.length; i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.println("Minimum element is " + min + ".");
	}
	
	
	public int[] getArray(){
		return new int[] {11, 12, 13};
	}
	
	
	public static void main(String[] args) {
		
		PassArrayMethod pass = new PassArrayMethod();
		
		int testAr[] = {30, 20, 10};
		
		pass.findMin(testAr);
		
		
		int array1[] = pass.getArray();
		System.out.println(array1[0]);

	}

}
