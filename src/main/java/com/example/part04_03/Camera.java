package com.example.part04_03;

import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
    private Function<Color, Color> filter;

    @SuppressWarnings("unchecked")
    public Camera(){
        super();
        setFilters();
    }
    
    public Color capture(final Color inputColor) {
        final Color processedColor = filter.apply(inputColor);
        return processedColor;
    }

    @SuppressWarnings("unchecked")
    public void setFilters(final Function<Color, Color>... filters) {
        filter = Stream.of(filters)
                       .reduce((filter, next) -> filter.compose(next))
                       .orElseGet(Function::identity);
    }
}
