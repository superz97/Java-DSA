package com.github.superz97.dsa;

import com.github.superz97.dsa.algorithms.AlgorithmsIntro;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = AlgorithmsIntro.generateRandomListOfIntegers(1, 9_999_999, 99);
        System.out.println(numbers.toString());
        System.out.println(AlgorithmsIntro.findMinimum(numbers));
    }

}
