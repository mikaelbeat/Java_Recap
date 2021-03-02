package collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet hash_data = new HashSet();
		
		hash_data.add("Hello");
		hash_data.add(666);
		hash_data.add("Data");
		hash_data.add("Snake");
		hash_data.add(123457689);
		System.out.println(hash_data);
		
		hash_data.remove(666);
		System.out.println(hash_data);

		System.out.println(hash_data.contains("Hello"));

		// Clears HashSet
		//hash_data.clear();
		//System.out.println(hash_data);

		Iterator i = hash_data.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}


	}

}
