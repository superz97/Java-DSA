package com.github.superz97.dsa;

import com.github.superz97.dsa.algorithms.AlgorithmsIntro;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    static NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);

    public static void main(String[] args) {
        List<Integer> numbers = AlgorithmsIntro.generateRandomListOfIntegers(1, 9_999_999, 9);
        String formattedNumbers = numbers.stream()
                .map(numberFormat::format)
                        .collect(Collectors.joining("; "));
        System.out.println(formattedNumbers);
        // System.out.println(AlgorithmsIntro.findMinimum(numbers));
        System.out.println(numberFormat.format(AlgorithmsIntro.findSum(numbers)));
    }

}
