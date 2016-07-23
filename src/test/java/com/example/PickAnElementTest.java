package com.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PickAnElementTest {

    PickAnElement sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Michel", "Allen");

    @Before
    public void setUp() {
        sut = new PickAnElement();
    }

    @Test
    public void 古のJava() {
        assertTrue(sut.pickName(friends, "M").contains("Mike"));
        assertTrue(sut.pickName(friends, "Z").contains("No name found"));
    }

    @Test
    public void JDK8のJava() {
        assertTrue(sut.pickNameUsingStream(friends, "M").contains("Mike"));
        assertTrue(sut.pickNameUsingStream(friends, "Z")
                .contains("No name found"));
    }
}
