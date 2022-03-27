package ru.stepashkin.hw1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public static void streamNumber() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map((x) -> x + "  ")
                .forEach(System.out::print);


    }
}

