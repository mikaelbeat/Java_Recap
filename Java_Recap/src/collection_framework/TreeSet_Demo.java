package collection_framework;

import java.util.TreeSet;

public class TreeSet_Demo {

    public static void main(String[] args) {

        TreeSet data = new TreeSet<>();

        data.add(4);
        data.add(1);
        data.add(3);
        data.add(2);
        System.out.println(data);

        data.remove(2);
        System.out.println(data);

        System.out.println(data.contains(4));

        System.out.println(data.first());
        System.out.println(data.last());
        
    }
    
}
