package com.in.action.study.chapter2.p71;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.AppleFormatter;

public class AppleGetWeight implements AppleFormatter {
    @Override
    public String test(Apple apple) {
        return String.valueOf(apple.getWeight());
    }
}
