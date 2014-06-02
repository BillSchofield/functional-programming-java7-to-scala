package com.thoughtworks.jcprogram.functional.java8.examples;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransformExample {
    private Integer numberToDivideBy;

    public TransformExample(Integer numberToDivideBy) {
        this.numberToDivideBy = numberToDivideBy;
    }

    public List<Integer> divide(List<Integer> numbersToDivide) {
        Function<Integer,Integer> divideByNumberFunction = integer -> integer / numberToDivideBy;
        return numbersToDivide
                .stream()
                .map(divideByNumberFunction)
                .collect(Collectors.<Integer>toList());
    }
}
