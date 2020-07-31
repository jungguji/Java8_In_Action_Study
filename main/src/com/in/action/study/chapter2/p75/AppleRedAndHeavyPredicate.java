package com.in.action.study.chapter2.p75;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.ApplePredicate;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return "red".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
