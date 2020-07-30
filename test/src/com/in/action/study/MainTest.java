package com.in.action.study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void prettyPrintApple() {
        //given
        List<Apple> inventory = Arrays.asList(
            new Apple("123")
            , new Apple("12345")
            , new Apple("150")
            , new Apple("1")
            , new Apple("200")
        );

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
        List<Apple> inventory = Arrays.asList(
            new Apple("123")
            , new Apple("12345")
            , new Apple("150")
            , new Apple("1")
            , new Apple("200")
        );

        Main main = new Main();

        //when
        List<String> list = main.prettyPrintApple(inventory, new AppleIsLightOrHeavy());

        //than
        assertThat(list).contains("Light")
                .contains("Heavy");
    }
}