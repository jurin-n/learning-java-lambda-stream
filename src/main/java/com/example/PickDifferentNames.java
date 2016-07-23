package com.example;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {

    final Function<String, Predicate<String>> startsWithLetter = 
                letter ->  name -> name.startsWith(letter);

    public long countStartM(List<String> names) {
        return names.stream().filter(startsWithLetter.apply("M")).count();
    }

    public long countStartA(List<String> names) {
        return names.stream().filter(startsWithLetter.apply("A")).count();
    }
}
