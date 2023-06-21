package org.bsp.streams.api.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxService {
    public static void main(String[] args) {
        List<Employee> employees = DataBase.getEmployees();
        //employees.stream().sorted((emp1, emp2) -> (int) (emp1.getSalary()-emp2.getSalary())).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}
