package com.example.part07_02;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import static com.example.part07_02.Memoizer.callMemoized;

public class RodCutterBasic {
    final List<Integer> prices;

    public RodCutterBasic(final List<Integer> pricesForLength) {
        prices = pricesForLength;
    }

    public int maxProfit(int length) {
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhenCut = maxProfit(i) + maxProfit(length - i);
            if (profit < priceWhenCut) {
                profit = priceWhenCut;
            }
        }
        return profit;
    }

    public int maxProfitMemoized(int rodLength) {
        BiFunction<Function<Integer, Integer>, Integer, Integer> compute = (
                func, length) -> {
            int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
            for (int i = 1; i < length; i++) {
                int priceWhenCut = func.apply(i) + func.apply(length - i);
                if (profit < priceWhenCut) {
                    profit = priceWhenCut;
                }
            }
            return profit;
        };
        return callMemoized(compute, rodLength);
    }
}
