package com.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrintListTest {
    PrintList sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Michel", "Allen");

    @Before
    public void setUp() {
        sut = new PrintList();
    }

    @Test
    public void 古のJava() {
        sut.print(friends);
    }

    @Test
    public void 古のJava2() {
        sut.printUpperCase(friends);
    }

    @Test
    public void JDK8のJava() {
        sut.printUsingStringJoiner(friends);
    }

    @Test
    public void JDK8のJava２() {
        sut.printUpperCaseUsingStringJoiner(friends);
    }
}
