package collection_framework;

import java.util.ArrayList;

public class ArrayList_Demo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		 data.add(1);
		 data.add(2);
		 data.add(3);
		 data.add(12345);
		 
		 System.out.println(data);
		 data.remove(1);
		 System.out.println(data);
		 
		 System.out.println(data.get(2));
		
		
	}

}
