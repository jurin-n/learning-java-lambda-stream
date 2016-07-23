package com.example.part04_04;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeaPlaneTest {

    @Test
    public void test() {
        SeaPlane sut = new  SeaPlane();
        sut.takeOff();
        sut.turn();
        sut.cruise();
        sut.land();
    }
}
