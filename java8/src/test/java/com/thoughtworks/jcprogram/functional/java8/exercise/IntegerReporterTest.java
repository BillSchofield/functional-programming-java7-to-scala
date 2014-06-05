package com.thoughtworks.jcprogram.functional.java8.exercise;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegerReporterTest {

    private IntegerReporter integerReporter;
    private List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = new ArrayList<>();
        integerReporter = new IntegerReporter();
    }

    @Ignore
    @Test
    public void shouldReportSquareRootWhenThereIsOneNumberAndItIsGreaterThan4() {
        numbers.add(9);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is("3"));
    }

    @Ignore
    @Test
    public void shouldReportNothingWhenThereIsOneNumberAndItIsLessThan4() {
        numbers.add(3);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is(""));
    }

    @Ignore
    @Test
    public void shouldReportWhenThereIsMoreThanOneNumber() {
        numbers.add(9);
        numbers.add(16);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is("3, 4"));
    }
}