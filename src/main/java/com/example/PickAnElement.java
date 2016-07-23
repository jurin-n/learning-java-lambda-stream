package com.example;

import java.util.List;
import java.util.Optional;

public class PickAnElement {

    public String pickName(List<String> names, String startingLetter) {
        String foundName = null;
        for (String name : names) {
            if (name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        return foundName == null ? "No name found" : foundName;
    }

    public String pickNameUsingStream(List<String> names,
            String startingLetter) {
        final Optional<String> foundName = names.stream()
                .filter(name -> name.startsWith(startingLetter)).findFirst();
        return foundName.orElse("No name found");
    }
}
