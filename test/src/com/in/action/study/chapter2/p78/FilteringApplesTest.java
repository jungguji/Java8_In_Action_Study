package com.in.action.study.chapter2.p78;

import com.in.action.study.chapter2.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FilteringApplesTest {

    private List<Apple> inventory;
    private List<Integer> numbers;
    private FilteringApples filteringApples;

    @BeforeEach
    void setUp() {
        this.filteringApples = new FilteringApples();

        this.inventory = Arrays.asList(
                new Apple(80,"green")
                , new Apple(155, "green")
                , new Apple(120, "red")
        );

        this.numbers = Arrays.asList(
                new Integer(1)
                , new Integer(2)
                , new Integer(3)
                , new Integer(4)
                , new Integer(5)
                , new Integer(6)
        );
    }

    @Test
    void filter() {
        List<Apple> redApples = this.filteringApples.filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));

        assertEquals(1, redApples.size());
        assertEquals(120, redApples.get(0).getWeight());

        List<Integer> evenNumbers = this.filteringApples.filter(numbers, (Integer i) -> i % 2 == 0);

        assertEquals(3, evenNumbers.size());
        assertThat(evenNumbers).contains(2)
                .contains(4)
                .contains(6);
    }
}