package com.example;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PickElementsTest {
    PickElements sut;
    final List<String> friends = Arrays.asList("Mike", "John", "Bill", "Gogo",
            "Ayako!", "Allen");

    @Before
    public void setUp() {
        sut = new PickElements();
    }

    @Test
    public void 古いやり方() {
        sut.printStartWithA(friends);
    }

    @Test
    public void ストリームとラムダ使うやり方() {
        sut.printStartWithAUsingLambdaAndStream(friends);
    }
}
