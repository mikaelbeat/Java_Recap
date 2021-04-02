package collection_framework;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {

		
		LinkedHashMap<String, Integer> data = new LinkedHashMap<String, Integer>();
		
		data.put("Demo1", 20);
		data.put("Demo2", 30);
		data.put("Demo3", 40);
		
		
		System.out.println(data);
		
		
		if (data.containsKey("Demo2")) {
			System.out.println("Value of Demo2 is " + data.get("Demo2"));
		}
		
		System.out.println("Size of the LinkedHashMap is " + data.size());
		
		System.out.println("Is LinkedHashMap empty " + data.isEmpty());
		
		System.out.println("Contains key Demo3 " + data.containsKey("Demo3"));
		
		System.out.println("Contains key Demo4 " + data.containsKey("Demo4"));
		
		System.out.println("Contais value 40 " + data.containsValue(40));
		
		System.out.println("Contais value 50 " + data.containsValue(50));

	}

}
