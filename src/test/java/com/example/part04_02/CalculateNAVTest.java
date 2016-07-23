package com.example.part04_02;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculateNAVTest {

    @Test
    public void test() {
        final CalculateNAV calculateNAV = new CalculateNAV(
                ticker -> new BigDecimal("6.01"));
        BigDecimal expected = new BigDecimal("6010.00");

        assertThat(calculateNAV.computeStockWorth("GOOG", 1000), is(expected));
    }

    @Test
    public void test2() {
        final CalculateNAV calculateNAV = new CalculateNAV(
                ticker -> YahooFinance.getPrice(ticker));
        BigDecimal expected = new BigDecimal("699210.022000");

        assertThat(calculateNAV.computeStockWorth("GOOG", 1000), is(expected));
    }
}
