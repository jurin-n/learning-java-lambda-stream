package com.example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DscountImperativeTest {
    List<BigDecimal> prices;
    DscountImperative sut;
    
    @Before
    public void setUp() {
        sut = new DscountImperative();
        prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"),
                new BigDecimal("17"), new BigDecimal("20"),
                new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

    }

    @Test
    public void getTotalOfDiscountedPrices() {
        assertThat(sut.getTotalOfDiscountedPrices(prices), is(new BigDecimal("67.5")));
    }

    @Test
    public void getTotalOfDiscountedPricesUsingJava8() {
        assertThat(sut.getTotalOfDiscountedPricesUsingJava8(prices), is(new BigDecimal("67.5")));
    }

}
