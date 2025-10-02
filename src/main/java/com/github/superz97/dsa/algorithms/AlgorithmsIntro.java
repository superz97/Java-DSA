package com.github.superz97.dsa.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlgorithmsIntro {

    public static List<Integer> generateRandomListOfIntegers(int min, int max, int size) {
        List<Integer> randomList = new ArrayList<>();
        Random  random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            randomList.add(randomNumber);
        }
        return randomList;
    }

    public static int findMinimum(List<Integer> numbers) {
        int minimum = Integer.MAX_VALUE;
        if (numbers == null || numbers.isEmpty()) {
            return -1;
        }
        for (Integer number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }

}
