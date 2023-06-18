package org.bsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bhavani");
        list.add("Nivi");
        list.add("Mangal");
        list.add("Jaga");
        list.add("Dhriti");
        list.add("Satya");
        list.add("Akankshya");
        list.add("Neha");


        //list.stream().filter(name -> name.startsWith("N")).forEach(name -> System.out.println(name));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, list.get(0));
        map.put(2, list.get(1));
        map.put(3, list.get(2));
        map.put(4, list.get(3));
        map.put(5, list.get(4));
        map.put(6, list.get(5));
        map.put(7, list.get(6));
        map.put(8, list.get(7));

        map.entrySet().stream().filter(obj -> obj.getValue().startsWith("N")).forEach(m -> System.out.println(m.getKey()+ ": " + m.getValue()));
    }
}
