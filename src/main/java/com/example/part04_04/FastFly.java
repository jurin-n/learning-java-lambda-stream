package com.example.part04_04;

public interface FastFly extends Fly {
    default void takeOff(){System.out.println("FastFly::takeOff");}
}
