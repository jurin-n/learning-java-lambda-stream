package com.example.part08_02;

import org.junit.Test;

public class PickStockFunctionalTest {

    @Test
    public void シーケンシャルでfindHighPriced実行() {
        System.out.println("High priced under $500 is "
                + PickStockFunctional.findHighPriced(Tickers.symbols.stream()));
    }
 
    @Test
    public void パラレルでfindHighPriced実行() {
        System.out.println("High priced under $500 is "
                + PickStockFunctional.findHighPriced(Tickers.symbols.parallelStream()));
    }
}
