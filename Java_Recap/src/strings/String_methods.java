package strings;

public class String_methods {

	public static void main(String[] args) {
		
		String data = "This is for testing!";
		
		// Printing character at given index
		System.out.println(data.charAt(3));
		
		// Concatenate string
		String data2 = data.concat(" With concat!");
		System.out.println(data2);
		
		// Check, does data contain given input
		System.out.println(data.contains("is"));
		
		// Check, does data end with given input
		System.out.println(data.endsWith("!"));
		
		System.out.println("\n******************************************\n");
		
		String data3 = "Hello!";
		String data4 = "Hello!";
		String data5 = "Winter is too long";
		
		// Compare two strings
		System.out.println(data3.equals(data4));
		
		// Returns index of given character
		System.out.println(data3.indexOf("o"));
		
		// Returns last index of given string
		System.out.println(data5.lastIndexOf("o"));
		
		// Return length of the string
		System.out.println(data5.length());
		
		System.out.println("\n******************************************\n");
		
		String data6 = "Summer!";
		String data7 = "This is getting, splitted!";
		
		System.out.println(data6.replace("u", "i"));
		String[] split_data7 = data7.split(" ");
		
		for (int i = 0; i < split_data7.length; i++) {
			System.out.println(split_data7[i]);
		}
		
		System.out.println(data6.startsWith("S"));
		
		
		
		
		

	}

}
