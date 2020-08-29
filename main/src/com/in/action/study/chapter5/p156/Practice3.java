package com.in.action.study.chapter5.p156;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Practice3 {
    public List<int[]> solution (List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .flatMap(i -> list2.stream()
                        .filter(j -> (i + j)  % 3 == 0)
                        .map(j -> new int[] {i, j})
                )
                .collect(toList());
    }
}
