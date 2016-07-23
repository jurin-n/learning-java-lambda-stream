package com.example;

import java.util.List;

public class SumNamesLength {
    public Object getSumLengths(List<String> names) {
        return names.stream().mapToInt(name -> name.length()).sum();
    }
}
