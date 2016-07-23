package com.example.part04_04;

public class SeaPlane extends Vehicle implements FastFly, Sail {

    @Override
    public void cruise() {
        System.out.println("SeaPlane::cruise currently cruise like:");
        FastFly.super.cruise();
        Sail.super.cruise();
    }
}
