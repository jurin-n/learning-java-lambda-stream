package com.example;

import java.util.ArrayList;
import java.util.List;

public class Transform {

    public void printUpperCase(List<String> names) {
        final List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        System.out.println(uppercaseNames);
    }

    public void printUpperCaseUsingLambda(List<String> names) {
        final List<String> uppercaseNames = new ArrayList<>();
        names.forEach(name -> uppercaseNames.add(name.toUpperCase()));
        System.out.println(uppercaseNames);
    }

    public void printUpperCaseUsingStreamAndLambda(List<String> names) {
        names.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + ","));
        System.out.println();
    }

    public void printUpperCaseUsingStreamAndLambda2(List<String> names) {
        names.stream().map(String::toUpperCase)
                .forEach(name -> System.out.print(name + ","));
        System.out.println();
    }
}
