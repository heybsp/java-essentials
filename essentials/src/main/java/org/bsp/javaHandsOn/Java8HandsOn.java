package org.bsp.javaHandsOn;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8HandsOn {
    public static void main(String[] args) {

        //Q: Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        /*List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(number -> number % 2 == 0).forEach(System.out::println);*/

        //Q: Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter((num) -> num.toString().startsWith("1")).forEach(System.out::println);*/

        //Q: How to find duplicate elements in a given integers list in java using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> newSet = new HashSet<>();
        myList.stream().filter(number -> !newSet.add(number)).forEach(System.out::println);*/

        //Q: Given the list of integers, find the first element of the list using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().filter(number -> myList.indexOf(number) == 0).forEach(System.out::println);*/

        //Q: Given a list of integers, find the total number of elements present in the list using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().count());*/

        //Q: Given a list of integers, find the maximum value element present in it using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer max = myList.stream().mapToInt(n -> n).max().orElseThrow(() -> new IllegalArgumentException("No such element"));
        System.out.println(max);*/

        //Q: Given a list of integers, sort all the values present in it using Stream functions?
        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //List<Integer> sortedList = myList.stream().sorted((n1, n2) -> n1.compareTo(n2)).collect(Collectors.toList());
        //List<Integer> sortedList = myList.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        List<Integer> sortedList = myList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);*/

        //Q: Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.
        /* List<Integer> myList = Arrays.asList(10,15,8,49,25,99,98,32,5);
        Set<Integer> newSet = new HashSet<>(myList);
        if (myList.size() == newSet.size()) System.out.println("false");
        else System.out.println("true");*/

        //Q: How will you get the current date and time using Java 8 Date and Time API?
        /*System.out.println("Current Local date: " + java.time.LocalDate.now());
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        System.out.println("Current Local Date n Time: " + java.time.LocalDateTime.now());*/

        //Q: Java 8 program to perform cube on list elements and filter numbers greater than 50.
        /*List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().mapToInt(n -> n*n*n).filter(n > n > 50).forEach(System.out::println);*/

        //Q: How to use map to convert object into Uppercase in Java 8?
        /*List<String> names = new ArrayList<>(Arrays.asList("jaga", "bhava", "nivi"));
        names.stream().map(String::toUpperCase).forEach(System.out::println);*/

        //JavaTechie HandsOn
        //Q:Java Program to count the occurrence of each character in a given string
        //String input = "ilovejavatechie";
        // Without using groupBy
        /*Map<Character, Integer> countMap = new HashMap<>();
        input.chars().mapToObj(i -> (char)i).forEach(i -> countMap.put(i, countMap.get(i)!=null?countMap.get(i)+1:1));
        System.out.println(countMap);*/
        //Using grouping by
        /*Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);*/

        //Q: Write a Java program to find all duplicate element from a given string
        /*String input = "ilovejavatechie";
        Set<Character> set = new HashSet<>();
        Set<Character> duplicates = input.chars().mapToObj(i -> (char) i).filter(i -> !set.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);*/
        //Using grouping by
        /*String input = "ilovejavatechie";
        List<String> duplicates = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicates);*/

        //Q: Java 8 program to find first non repeat element from a given string
        /*String input = "ilovejavatechie";
        String firstNonRepeat = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(firstNonRepeat);*/

        //Q: Java 8 program to find second highest number from given array
        /*int[] numbers = {5,9,11,2,8,21,1};
        Integer secondHighest = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHighest);*/

        //Q: Java P8 program to find the longest string from a given array
        /*String[] strArray = {"java", "techie", "springboot","microservices"};
        String longest = Arrays.stream(strArray).sorted((s1, s2) -> s2.length()-s1.length()).findFirst().get();
        System.out.println(longest);*/
        /*String[] strArray = {"java", "techie", "springboot","microservices"};
        String ans = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length()>word2.length()?word1:word2)
                .get();
        System.out.println(ans);*/

        //Q: Find Nth highest salary using Java streams
        /*Map<String, Integer> empMap = new HashMap<>();
        empMap.put("anil", 1100);
        empMap.put("bhavna", 1200);
        empMap.put("micael", 1500);
        empMap.put("tom", 1500);
        empMap.put("ankit", 1900);
        empMap.put("daniel", 1900);
        empMap.put("james", 1900);

        Integer n = 2;
        // using groupingBy
        *//*System.out.println(findNthHighestSalary(n, empMap));*//*
        Map<Integer, List<String>> collect = empMap.entrySet().stream()
                .collect(Collectors.groupingBy(entry -> entry.getValue(),
                        Collectors.mapping(entry -> entry.getKey(), Collectors.toList())));
        System.out.println(collect);*/

        //Q: Java 8 program to find all the elements of the array starting with 1
        /*int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        List<Integer> collect = Arrays.stream(numbers).boxed().map(n -> n + "")
                .filter(n -> n.startsWith("1")).map(n -> Integer.valueOf(n))
                .collect(Collectors.toList());
        System.out.println(collect);*/

    }

    //without using groupingBy Nth Salary question without emp name
    public static Integer findNthHighestSalary(Integer n, Map<String, Integer> map) {
        Set<Integer> intSet= new HashSet<>();
        intSet = map.entrySet()
                .stream()
                .sorted((n1, n2) -> n2.getValue() - n1.getValue())
                .map(entry -> entry.getValue())
                .collect(Collectors.toSet());
        List<Integer> uList = new ArrayList<>(intSet);
        return uList.stream().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get();
    }


}

@Data
@AllArgsConstructor
class Notes {
    private Integer id;
    private String body;
    private Integer tag;
}
