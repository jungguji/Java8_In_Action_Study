package com.in.action.study.chapter2.p71;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.AppleFormatter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> prettyPrintApple(List<Apple> inventory, AppleFormatter p) {
        List<String> list = new ArrayList<>();
        for (Apple apple : inventory) {
            String output = p.test(apple);
            list.add(output);
            System.out.println(output);
        }

        return list;
    }
}
