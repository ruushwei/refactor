package com.hongwei.refactor;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RefactorApplicationTests {

    @Test
    void contextLoads() {
        int[] parts = new int[] {1, 1, 1, 2, 3, 3, 3};
        int i = leastInterval(parts, 2);
        System.out.println(i);
    }

    public int leastInterval(int[] parts, int n) {
        if (parts.length <= 1 || n < 1) return parts.length;

        int[] counts = new int[10];
        for (int i = 0; i < parts.length; i++) {
            counts[parts[i]]++;
        }

        Arrays.sort(counts);
        int maxCount = counts[9];
        int retCount = (maxCount - 1) * (n + 1) + 1;
        int i = 8;

        while (i >= 0 && counts[i] == maxCount) {
            retCount++;
            i--;
        }

        return Math.max(retCount, parts.length);
    }
}
