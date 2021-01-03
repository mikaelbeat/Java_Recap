package training;

public class Double_parsing {

	public static void main(String[] args) {
		
		
		double dnum = 5.5;
		System.out.println(dnum + 15.5);
		System.out.println("\n");
		
		// Parsing double to integer
		int inum = (int) dnum;
		System.out.println(inum);
		System.out.println("\n");
		
		// Parsing double to char
		char ch = ("" + dnum).charAt(0);
		System.out.println(ch);
		System.out.println("\n");
		
		// Parsing double to string
		String data = ("" + dnum);
		System.out.println(data + "€");
		System.out.println("\n");
		
		//Parsing integer to double
		int value = 10;
		double dvalue = value;
		System.out.println(dvalue);
		System.out.println("\n");
		
		// Parsing string to double
		double temp_v = 0;
		String amount = "4.5";
		temp_v  = Double.parseDouble(amount);
		System.out.println(temp_v );
		System.out.println("\n");
		
		// Parsing char to double
		char ch2 = '7';
		double num = 0;
		num = Double.parseDouble("" + ch2);
		System.out.println(num);
		
	}

}
