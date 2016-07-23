package com.example;

import java.util.List;
import java.util.Optional;

public class PickALongest {

    public String pickLongestString(List<String> names) {
        Optional<String> longestString =  names.stream()
                                               .reduce(
                                                  (name1,name2)->(name1.length() >= name2.length() ? name1:name2));
        return longestString.orElse("No Text");
    }
}
