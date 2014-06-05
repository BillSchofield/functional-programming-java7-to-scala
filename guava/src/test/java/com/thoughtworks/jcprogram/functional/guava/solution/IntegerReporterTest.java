package com.thoughtworks.jcprogram.functional.guava.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegerReporterTest {

    private IntegerReporter integerReporter;
    private List<Integer> numbers;

    @Before
    public void setUp() throws Exception {
        numbers = newArrayList();
        integerReporter = new IntegerReporter();
    }

    @Test
    public void shouldReportSquareRootWhenThereIsOneNumberAndItIsGreaterThan4() {
        numbers.add(9);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is("3"));
    }

    @Test
    public void shouldReportNothingWhenThereIsOneNumberAndItIsLessThan4() {
        numbers.add(3);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is(""));
    }

    @Test
    public void shouldReportWhenThereIsMoreThanOneNumber() {
        numbers.add(9);
        numbers.add(16);
        String result = integerReporter.reportSquareRootsOfLargeNumbers(numbers);

        assertThat(result, is("3, 4"));
    }

}