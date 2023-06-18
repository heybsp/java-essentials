package org.bsp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo{

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40);
        list.stream().filter(i -> i%2==0).forEach(i -> System.out.println("Printing: " + i));
    }
}
