package org.bsp.streams.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Bhavani", "CS", 120000));
        list.add(new Employee(2, "Sivasish", "IT", 100000));
        list.add(new Employee(3, "Ayaskant", "ECE", 140000));
        list.add(new Employee(4, "Nivi", "ECE", 120000));
        list.add(new Employee(5, "Jaga", "ECE", 100000));
        list.add(new Employee(6, "Mangal", "CS", 110000));
        list.add(new Employee(7, "Satya", "CS", 180000));
        list.add(new Employee(8, "Neha", "IT", 190000));
        list.add(new Employee(9, "Urja", "CS", 220000));
        list.add(new Employee(10, "Atif", "CS", 220000));
        list.add(new Employee(11, "Kumar", "IT", 320000));
        list.add(new Employee(12, "Deepak", "CS", 100000));
        list.add(new Employee(13, "Tabu", "CS", 120000));
        list.add(new Employee(14, "SRK", "IT", 320000));
        list.add(new Employee(15, "Dipen", "CS", 220000));
        list.add(new Employee(16, "Arjun", "CS", 120000));
        list.add(new Employee(17, "Bhavya", "IT", 220000));
        list.add(new Employee(18, "Mohit", "CS", 320000));
        list.add(new Employee(19, "Amit", "IT", 220000));
        list.add(new Employee(20, "Ankit", "IT", 120000));
        list.add(new Employee(21, "Avinabh", "ECE", 120000));
        list.add(new Employee(22, "Kumaran", "CS", 220000));
        list.add(new Employee(23, "Shivani", "IT", 320000));
        return list;
    }
}
