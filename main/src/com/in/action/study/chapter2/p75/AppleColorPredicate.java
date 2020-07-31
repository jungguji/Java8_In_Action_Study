package com.in.action.study.chapter2.p75;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.ApplePredicate;

public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
