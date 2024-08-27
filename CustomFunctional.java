package com.FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface CustomFunctional {
    //ek function interface can extend a non functional interface only if non functional me ek hi method ho ie default
    //ek noraml interdace can extend a functional interface without any problem
    //a functiona interface can exteand another functional interface only if both the methods are exactly same
    public void fly(String s);

    public static void main(String[] args) {
        CustomFunctional customFunctional=(String s)->System.out.println("hello "+s);
        List<String> list= Arrays.asList("Ram","Shaym");
        for(String s:list){
            customFunctional.fly(s);
        }
    }
}
