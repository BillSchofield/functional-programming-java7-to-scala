package com.thoughtworks.jcprogram.functional.exercise;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringReducerTest {

    private ArrayList<String> strings;
    private StringReducer reducer;

    @Before
    public void setUp() throws Exception {
        reducer = new StringReducer();
        strings = new ArrayList<>();
    }

    @Ignore
    @Test
    public void shouldReduceToFirstLetterWhenStringIsLength4() {
        strings.add("1234");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is("1"));
    }

    @Ignore
    @Test
    public void shouldReduceToNothingWhenStringIsNotLength4() {
        strings.add("12345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is(""));
    }

    @Ignore
    @Test
    public void shouldReduceMoreThanOneString() {
        strings.add("1234");
        strings.add("2345");
        String result = reducer.reduceToFirstLetterOfLengthFourStrings(strings);

        assertThat(result, is("12"));
    }
}