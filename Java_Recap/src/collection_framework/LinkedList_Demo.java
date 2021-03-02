package collection_framework;

import java.util.LinkedList;

public class LinkedList_demo {
	
	public static void main(String[] args) {
		
		LinkedList data = new LinkedList();
		
		data.add(50);
		data.add("Java");
		data.add(12345);
		data.add("Demo");
		data.add(999);
		
		System.out.println(data);
		
		data.addFirst("First");
		System.out.println(data);
		
		data.addLast("Last");
		System.out.println(data);
		
	}

}
