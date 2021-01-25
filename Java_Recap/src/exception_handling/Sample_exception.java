package exception_handling;

public class Sample_exception {

	public static void main(String[] args) {
		
		try {
			
			int value = 100;
			int result = value / 0;
			
		} catch (Exception e) {
			
			System.out.println("Error -> " + e);
			
		}
		
		System.out.println("\n****************************************\n");
		
		try {
			
			String text = null;
			System.out.println(text.length());
			
		} catch (Exception e) {
			
			System.out.println("Error -> " + e);
			
		}

		

	}

}
