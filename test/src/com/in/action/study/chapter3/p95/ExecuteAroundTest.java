package com.in.action.study.chapter3.p95;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExecuteAroundTest {

    @Test
    void processFile() {
        ExecuteAround executeAround = new ExecuteAround();

        try {
            String oneLine = executeAround.processFile((BufferedReader br) -> br.readLine());
            String twoLine = executeAround.processFile((BufferedReader br) -> br.readLine() + br.readLine());

            assertEquals("한줄", oneLine);
            assertEquals("한줄두줄", twoLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}