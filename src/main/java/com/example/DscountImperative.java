package com.example;

import java.math.BigDecimal;
import java.util.List;

public class DscountImperative {

    public BigDecimal getTotalOfDiscountedPrices(List<BigDecimal> prices) {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalOfDiscountedPrices = totalOfDiscountedPrices
                        .add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
        return totalOfDiscountedPrices;
    }

    public Object getTotalOfDiscountedPricesUsingJava8(
            List<BigDecimal> prices) {
        return prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
