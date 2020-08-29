package com.in.action.study.chapter5.p156;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Practice3Test {

    @Test
    void solution() {
        Practice3 test = new Practice3();

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<int[]> answer = test.solution(list1, list2);

        assertArrayEquals(new int[]{2, 4}, answer.get(0));
        assertArrayEquals(new int[]{3, 3}, answer.get(1));
    }
}