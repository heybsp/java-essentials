package org.bsp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40);
        Consumer<Integer> consumer = i -> System.out.println("Printing: " + i);
        list.stream().forEach(consumer);
    }
}
