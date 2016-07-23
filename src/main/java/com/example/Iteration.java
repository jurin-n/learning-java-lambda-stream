package com.example;

import java.util.List;
import java.util.function.Consumer;

public class Iteration {

    public void printListByOldWay(List<String> friends) {
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
    }

    public void printListByEnhancedForStatement(List<String> friends) {
        for (String name : friends) {
            System.out.println(name);
        }
    }

    public void printListByJDK8way(List<String> friends) {
        friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });
    }

    public void printListByJDK8wayUsingLambda(List<String> friends) {
        friends.forEach(name -> System.out.println(name));
    }

    public void printListByJDK8wayUsingLambda2(List<String> friends) {
        friends.forEach(System.out::println);
    }
}
