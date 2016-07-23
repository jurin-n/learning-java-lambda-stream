package com.example.part08_02;

import org.junit.Before;
import org.junit.Test;

public class PickStockImperativeTest {
    PickStockImperative sut;

    @Before
    public void setUp() {
        sut = new PickStockImperative();
    }

    @Test
    public void getHighPriceUnder500() {
        System.out.println("High priced under $500 is " + sut.getHighPriceUnder500());
    }
    
    @Test
    public void getHighPriceUnder500Clubbed() {
        System.out.println("High priced under $500 is " + sut.getHighPriceUnder500Clubbed());
    }
}
