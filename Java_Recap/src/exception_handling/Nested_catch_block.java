package exception_handling;

public class Nested_catch_block {
	
	public static void main(String[] args) {
		
		try {
			
			String text = null;
			System.out.println(text.length());
			
			try {
				
				int result = 100/0;
				System.out.println(result);
				
			} catch(Exception e) {
				
				System.out.println("Error -> " + e);
				
			}
			
		} catch(Exception e) {
			
			System.out.println("Error -> " + e);
				
		} finally {
			
			System.out.println("This is executed everytime!");
			System.out.println("Used to close connection or stream.");
			
		}
		
	}

}
