package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PickElements {

    public void printStartWithA(List<String> names) {
        final List<String> startsWithA = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                startsWithA.add(name);
            }
        }
        System.out.println(startsWithA);
    }

    public void printStartWithAUsingLambdaAndStream(List<String> names) {
        final List<String> startsWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(startsWithA);
    }
}
