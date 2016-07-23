package com.example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SumNamesLengthTest {

    SumNamesLength sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Michel", "Allen");

    @Before
    public void setUp() {
        sut = new SumNamesLength();
    }

    @Test
    public void test() {
        assertThat(sut.getSumLengths(friends), is(33));
    }
}
