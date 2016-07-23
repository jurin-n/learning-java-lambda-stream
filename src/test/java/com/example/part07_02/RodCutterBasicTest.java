package com.example.part07_02;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RodCutterBasicTest {

    List<Integer> priceValues;
    RodCutterBasic sut;

    @Before
    public void setUp() {
        priceValues = Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
        sut = new RodCutterBasic(priceValues);
    }

    @Test
    public void 長さが５の場合_最大の利益は１０() {
        assertThat(sut.maxProfit(5), is(10));
    }

    @Test
    public void 長さが22の場合_最大の利益は44() {
        assertThat(sut.maxProfit(22), is(44));
    }

    @Ignore("何十分待っても終わらないので実行しない")
    @Test
    public void 長さが500の場合_最大の利益は1000() {
        assertThat(sut.maxProfit(500), is(1000));
    }

    @Test
    public void TCO_長さが５の場合_最大の利益は１０() {
        assertThat(sut.maxProfitMemoized(5), is(10));
    }

    @Test
    public void TCO_長さが22の場合_最大の利益は44() {
        assertThat(sut.maxProfitMemoized(22), is(44));
    }

    @Test
    public void TCO_長さが500の場合_最大の利益は1000() {
        assertThat(sut.maxProfitMemoized(500), is(1000));
    }
}
