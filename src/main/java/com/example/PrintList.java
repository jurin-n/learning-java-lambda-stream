package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class PrintList {

    public void print(List<String> names) {
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.print(names.get(i) + ",");
        }
        if (names.size() > 0) {
            System.out.println(names.get(names.size() - 1));
        }
    }

    public void printUpperCase(List<String> names) {
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.print(names.get(i).toUpperCase() + ",");
        }
        if (names.size() > 0) {
            System.out.println(names.get(names.size() - 1).toUpperCase());
        }
    }

    public void printUsingStringJoiner(List<String> names) {
        System.out.println(String.join(",", names));
    }

    public void printUpperCaseUsingStringJoiner(List<String> names) {
        System.out.println(names.stream().map(String::toUpperCase)
                .collect(Collectors.joining(",")));
    }
}
