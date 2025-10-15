package lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("Java");
        System.out.println("My List: " + myList);

        Set<String> mySet = new HashSet<>();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Java");
        System.out.println("My Set: " + mySet);

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Hello");
        myMap.put(2, "World");
        myMap.put(3, "Java");
        System.out.println("My Map: " + myMap);

        System.out.println("Hello Hashcode: " + myMap.get(1).hashCode());

        Set<Object> generalSet = new HashSet<>();
        generalSet.add("Hello");
        generalSet.add("World");
        generalSet.add(12345);
        System.out.println("General Set: " + generalSet);
        System.out.println("Hashcode: " + generalSet.hashCode());
    }
}
