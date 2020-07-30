package com.in.action.study;

public class AppleGetWeight implements ApplePredicate {
    @Override
    public String test(Apple apple) {
        return apple.getWeight();
    }
}
