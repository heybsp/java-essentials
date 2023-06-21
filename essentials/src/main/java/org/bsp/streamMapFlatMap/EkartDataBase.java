package org.bsp.streamMapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "bhavani", "bhavani@gmail.com", Arrays.asList("9237552500", "8763433737")),
                new Customer(102, "shivani", "shivani@gmail.com", Arrays.asList("9237552501", "87634325737")),
                new Customer(103, "shankar", "shankar@gmail.com", Arrays.asList("9237552502", "8763445737")),
                new Customer(104, "nivi", "nivi@gmail.com", Arrays.asList("9237552503", "8763435734")),
                new Customer(105, "satya", "satya@gmail.com", Arrays.asList("9237552540", "8763435736"))
        ).collect(Collectors.toList());
    }
}
