package com.in.action.study;

public class AppleIsLightOrHeavy implements ApplePredicate {
    @Override
    public String test(Apple apple) {
        return Integer.parseInt(apple.getWeight()) > 150 ? "Heavy" : "Light";
    }
}
