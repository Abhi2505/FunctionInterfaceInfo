package com.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    //it is also a functinonal interface that accepts no input parameter but produces a result
    //it is having a get method with no arg


    public static void main(String[] args) {
        Supplier<Integer>supplier=()->{
            Random random=new Random();
            return random.nextInt(12);
        };
        for(int i=0;i<5;i++){
            System.out.println(supplier.get());
        }
    }
}

