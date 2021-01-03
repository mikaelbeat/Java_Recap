package training;

public class String_integer_parsing {

	public static void main(String[] args) {
		
		// Parsing integer to string
		int num = 50;
		String String_num = Integer.toString(num);
		System.out.println(String_num + String_num);
		System.out.println("\n");

		// Parsing string to integer
		//int input_value = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		//System.out.println(input_value + 10);
		//System.out.println("\n");

		// Parsing character to string
		char ch = '#';
		String str_ch = "" + ch;
		System.out.println(str_ch);
		System.out.println("\n");

		// Parsing one letter from string to char
		String test = "Hello";
		char one_char = test.charAt(0);
		System.out.println(one_char);
		System.out.println("\n");

		// Parsing interger to char
		int data = 12345;
		char int_char = ("" + data).charAt(0);
		System.out.println(int_char);
		System.out.println("\n");

	}

}
