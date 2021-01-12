package strings;

public class String_buffer {

	public static void main(String[] args) {
		
		// String cannot be changed
		String name = "Test";
		name.concat(" Person");
		System.out.println(name);
		
		// String can be changed using append
		StringBuffer test1 = new StringBuffer("Hello");
		test1.append(" World!");
		System.out.println("Using append -> " + test1);
		
		// Adding to string using insert
		StringBuffer test3 = new StringBuffer("This");
		test3.insert(4, " WORKS!");
		System.out.println("Using insert -> " + test3);
		
		// Replacing part of the string
		StringBuffer test4 = new StringBuffer("Demo");
		test4.replace(0, 1, "T");
		System.out.println("Using replace -> " + test4);
		
		// Delete part of the string
		StringBuffer test5 = new StringBuffer("Sun is shining!");
		test5.delete(7, 14);
		System.out.println("Using delete -> " + test5);
		
		// Reverse string
		StringBuffer test6 = new StringBuffer("Cold War");
		test6.reverse();
		System.out.println("Using reverse -> " + test6);
	}

}
