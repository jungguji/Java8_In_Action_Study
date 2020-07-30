package com.in.action.study;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> prettyPrintApple(List<Apple> inventory, ApplePredicate p) {
        List<String> list = new ArrayList<>();
        for (Apple apple : inventory) {
            String output = p.test(apple);
            list.add(output);
            System.out.println(output);
        }

        return list;
    }
}
