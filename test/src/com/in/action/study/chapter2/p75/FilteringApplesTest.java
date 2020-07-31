package com.in.action.study.chapter2.p75;

import com.in.action.study.chapter2.Apple;
import com.in.action.study.chapter2.ApplePredicate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilteringApplesTest {

    private List<Apple> inventory;
    private FilteringApples filteringApples;

    @BeforeEach
    void setUp() {
        this.filteringApples = new FilteringApples();

        this.inventory = Arrays.asList(
                new Apple(80,"green")
                , new Apple(155, "green")
                , new Apple(120, "red")
        );
    }

    @Test
    void filter() {
        List<Apple> redApples = this.filteringApples.filter(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });

        assertEquals(1, redApples.size());
        assertEquals(120, redApples.get(0).getWeight());
    }

    @Test
    void filter_람다식() {
        List<Apple> redApples = this.filteringApples.filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));

        assertEquals(1, redApples.size());
        assertEquals(120, redApples.get(0).getWeight());
    }
}