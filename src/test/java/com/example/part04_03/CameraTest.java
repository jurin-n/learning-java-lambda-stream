package com.example.part04_03;

import java.awt.Color;
import java.util.function.Consumer;

import org.junit.Before;
import org.junit.Test;

public class CameraTest {
    Camera camera;

    @Before
    public void setUp() {
        camera = new Camera();
    }

    @SuppressWarnings("unchecked")
    @Test
    public void test() {
        final Consumer<String> printCaptured = (filterInfo) -> System.out
                .println(String.format("with %s: %s", filterInfo,
                        camera.capture(new Color(200, 100, 200))));
        printCaptured.accept("no fileter");

        camera.setFilters(Color::brighter);
        printCaptured.accept("brighter filter");

        camera.setFilters(Color::darker);
        printCaptured.accept("darker filter");

        camera.setFilters(Color::brighter, Color::darker);
        printCaptured.accept("brighter & darker filter");

    }

}
