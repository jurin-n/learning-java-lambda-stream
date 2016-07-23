package com.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TransformTest {
    Transform sut;
    final List<String> friends = Arrays.asList("make", "john", "bill", "gogo",
            "ayako!");

    @Before
    public void setUp() {
        sut = new Transform();
    }

    @Test
    public void 古いやり方() {
        sut.printUpperCase(friends);
    }

    @Test
    public void ちょっとだけラムダ() {
        sut.printUpperCaseUsingLambda(friends);
    }

    @Test
    public void ストリームとラムダ() {
        sut.printUpperCaseUsingStreamAndLambda(friends);
    }
    
    @Test
    public void ストリームとラムダとメソッド参照() {
        sut.printUpperCaseUsingStreamAndLambda2(friends);
    }
}
