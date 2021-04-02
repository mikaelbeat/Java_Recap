package collection_framework;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		data.put("Demo1", 20);
		data.put("Demo2", 30);
		data.put("Demo3", 40);
		
		System.out.println(data);
		
		
		if (data.containsKey("Demo2")) {
			System.out.println("Value of Demo2 is " + data.get("Demo2"));
		}
		
		System.out.println("Size of the HashMap is " + data.size());
		
		System.out.println("Is HashMap empty " + data.isEmpty());

	}

}
