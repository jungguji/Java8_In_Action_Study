package com.in.action.study.chapter5.p156;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Practice2 {
    public List<int[]> solution (List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                    .flatMap(i -> list2.stream()
                                        .map(j -> new int[] {i, j})
                    )
                .collect(toList());
    }
}
