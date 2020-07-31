package com.in.action.study.chapter2.p71;

import com.in.action.study.chapter2.Apple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    private static final String COLOR = "red";

    private List<Apple> inventory;

    @BeforeEach
    void setUp() {
        this.inventory = Arrays.asList(
                new Apple(123, COLOR)
                , new Apple(12345, COLOR)
                , new Apple(150, COLOR)
                , new Apple(1, COLOR)
                , new Apple(200, COLOR)
        );
    }
    @Test
    void prettyPrintApple() {

        //given
        Main main = new Main();

        //when
        List<String> list = main.prettyPrintApple(inventory, new AppleGetWeight());

        //than
        assertThat(list).contains("123")
                .contains("12345")
                .contains("150")
                .contains("1")
                .contains("200");
    }

    @Test
    void prettyPrintApple1() {
        //given
        Main main = new Main();

        //when
        List<String> list = main.prettyPrintApple(inventory, new AppleIsLightOrHeavy());

        //than
        assertThat(list).contains("Light")
                .contains("Heavy");
    }
}