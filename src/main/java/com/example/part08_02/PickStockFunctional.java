package com.example.part08_02;

import java.util.stream.Stream;

public class PickStockFunctional {
    public static StockInfo findHighPriced(final Stream<String> symbols) {
        return symbols.map(StockUtil::getPrice)
                .filter(StockUtil.isPriceLessThan(500))
                .reduce(StockUtil::pickHigh)
                .get();
    }
}
