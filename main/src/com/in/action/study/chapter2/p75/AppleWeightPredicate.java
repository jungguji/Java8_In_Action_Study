package com.in.action.study.chapter2.p75;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.ApplePredicate;

public class AppleWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }

}
