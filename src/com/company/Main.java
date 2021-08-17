package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> arrayList = new ArrayList<>();

        for (int x : intList) {
            if (x % 2 == 0 && x > 0) {
                arrayList.add(x);
            }
        }
        for (int y = 0; y < arrayList.size() - 1; y++) {
            for (int i = 0; i < arrayList.size() - 1 - y; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    int x = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, x);
                }
            }
        }
        System.out.println(arrayList);
    }
}