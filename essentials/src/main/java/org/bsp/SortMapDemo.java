package org.bsp;

import org.bsp.streams.api.example.DataBase;
import org.bsp.streams.api.example.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = DataBase.getEmployees();
        int i = 0;
        Map<String, Long> map = new HashMap<>();
        do {
            map.put(employeeList.get(i).getName(), employeeList.get(i).getSalary());
            i++;
        }while (i < 20);

//        for(Map.Entry<String, Long> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        map.forEach((key, value) -> System.out.println(key + ": " + value));

        //List<Map.Entry<String, Long>> entries = new ArrayList<>(map.entrySet());
        map.entrySet().stream().sorted((e1, e2) -> (int) (e1.getValue()-e2.getValue())).forEach(obj -> System.out.println(obj));
        //Collections.sort(entries, (emp1, emp2) -> (int)(emp2.getValue()-emp1.getValue()));
        //entries.forEach((e) -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
