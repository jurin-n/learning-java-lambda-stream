package com.example;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class IterationTest {

    Iteration sut;
    final List<String> friends = Arrays.asList("太郎", "二郎", "三郎", "史郎", "ゴルゴ");

    @Before
    public void setUp() {
        sut = new Iteration();
    }

    @Test
    public void 昔のやりかた() {
        sut.printListByOldWay(friends);
    }

    @Test
    public void 拡張for文() {
        sut.printListByEnhancedForStatement(friends);
    }

    @Test
    public void JDK8の方法() {
        sut.printListByJDK8way(friends);
    }

    @Test
    public void JDK8の方法_ラムダ式() {
        sut.printListByJDK8wayUsingLambda(friends);
    }
    
    @Test
    public void JDK8の方法_ラムダ式2() {
        sut.printListByJDK8wayUsingLambda2(friends);
    }
}
