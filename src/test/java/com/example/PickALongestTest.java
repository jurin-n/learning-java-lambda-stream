package com.example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PickALongestTest {
    PickALongest sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Michel", "Allen");

    @Before
    public void setUp() {
        sut = new PickALongest();
    }

    @Test
    public void test() {
        assertThat(sut.pickLongestString(friends), is("Ayako!"));
    }
}
