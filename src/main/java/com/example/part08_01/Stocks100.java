package com.example.part08_01;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class Stocks100 {
    final static BigDecimal HUNDRED = new BigDecimal("100");

    static String getStocks100() {
        return Tickers.symbols.stream().filter(
                symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
                .sorted().collect(Collectors.joining(","));
    }
}
