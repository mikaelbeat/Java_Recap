package strings;

public class String_buffer {

	public static void main(String[] args) {
		
		// String cannot be changed
		String name = "Test";
		name.concat(" Person");
		System.out.println(name);
		
		// String can be changed
		StringBuffer name2 = new StringBuffer("Hello");
		name2.append(" World!");
		System.out.println(name2);

	}

}
