package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class List_interface {

	public static void main(String[] args) {
		
		List data = new ArrayList();
		
		data.add(0, "Hello");
		data.add(1, "World");
		
		System.out.println(data);
		
		
		List data2 = new ArrayList();
		data2.add("From");
		data2.add("another");
		data2.add("list");
		
		data.addAll(0, data2);
		System.out.println(data);

		data.remove(0);
		data.remove(0);
		data.remove(0);
		System.out.println(data);
		
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		
		data.set(0, "New");
		data.set(1, "thing");
		System.out.println(data);
		
		List data3 = new ArrayList();
		data3.add(10);
		data3.add(20);
		data3.add(30);
		data3.add(40);
		System.out.println(data3);
		

	}

}
