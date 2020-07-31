package com.in.action.study.chapter3.p95;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {

    public String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("main/resources/test.txt"))) {
            return p.process(br);
        }
    }
}
