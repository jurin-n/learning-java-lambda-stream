package com.example.part08_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PickStockImperative {
    StockInfo getHighPriceUnder500() {
        final List<StockInfo> stocks = new ArrayList<>();
        for (String symbol : Tickers.symbols) {
            stocks.add(StockUtil.getPrice(symbol));
        }

        final List<StockInfo> stocksPricedUnder500 = new ArrayList<>();
        final Predicate<StockInfo> isPriceLessThan500 = StockUtil
                .isPriceLessThan(500);
        for (StockInfo stock : stocks) {
            if (isPriceLessThan500.test(stock)) {
                stocksPricedUnder500.add(stock);
            }
        }

        StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
        for (StockInfo stock : stocksPricedUnder500) {
            highPriced = StockUtil.pickHigh(highPriced, stock);
        }
        return highPriced;
    }

    StockInfo getHighPriceUnder500Clubbed() {
        StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
        final Predicate<StockInfo> isPriceLessThan500 = StockUtil
                .isPriceLessThan(500);

        for (String symbol : Tickers.symbols) {
            StockInfo stockInfo = StockUtil.getPrice(symbol);

            if (isPriceLessThan500.test(stockInfo)) {
                highPriced = StockUtil.pickHigh(highPriced, stockInfo);
            }
        }
        return highPriced;
    }
}
