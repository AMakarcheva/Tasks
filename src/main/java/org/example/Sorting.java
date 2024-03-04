package org.example;

import java.util.Arrays;

public class Sorting {
    protected static void sorting(int[] i) {
        int max = Arrays.stream(i).max().getAsInt();
        System.out.println(max);
    }
}
