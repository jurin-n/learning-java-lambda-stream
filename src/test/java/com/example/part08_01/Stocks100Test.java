package com.example.part08_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stocks100Test {

    @Test
    public void test() {
        System.out.println("Stocks priced over $100 are " + Stocks100.getStocks100());
    }

}
