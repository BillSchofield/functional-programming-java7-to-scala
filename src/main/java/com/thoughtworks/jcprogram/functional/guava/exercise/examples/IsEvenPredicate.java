package com.thoughtworks.jcprogram.functional.guava.exercise.examples;

import com.google.common.base.Predicate;

public class IsEvenPredicate implements Predicate<Integer> {
    public boolean apply(Integer integer) {
        return integer % 2 == 0;
    }
}
