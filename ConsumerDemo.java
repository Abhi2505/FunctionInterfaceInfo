package com.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    //Consumer is a functional interface
    //that accept a single input parameter and returns no result
    //It has a method named accept(T t)
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        Consumer<String> consumer=(String s)->System.out.println(s);
        names.forEach(consumer);

    }


}
