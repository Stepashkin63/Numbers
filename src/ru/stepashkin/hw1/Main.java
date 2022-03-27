package ru.stepashkin.hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int x : intList) {
            if (x > 0 && x % 2 == 0) {
                count++;
                result.add(x);
                result.sort(Integer::compareTo);
            }
        }
        System.out.println(result);
        StreamMain.streamNumber();
    }
}