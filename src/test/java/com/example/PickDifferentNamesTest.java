package com.example;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PickDifferentNamesTest {
    PickDifferentNames sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Allen");

    @Before
    public void setUp() {
        sut = new PickDifferentNames();
    }

    @Test
    public void test() {
        assertThat(sut.countStartM(friends),is(1L));
        assertThat(sut.countStartA(friends),is(2L));
    }

}
