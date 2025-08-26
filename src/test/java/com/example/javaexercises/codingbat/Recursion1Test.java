package com.example.javaexercises.codingbat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.in;
import static org.junit.jupiter.api.Assertions.*;

class Recursion1Test {

    private final Recursion1 rec1 = new Recursion1();

    @ParameterizedTest
    @MethodSource("count8Arguments")
    void count8(int input, int expected) {
        assertThat(rec1.count8(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("countHi2Arguments")
    void countHi2(String input, int expected) {
        assertThat(rec1.countHi2(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("parenBitArguments")
    void parenBit(String input, String expected) {
        assertThat(rec1.parenBit(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("parenBitArguments")
    void parenBitLoop(String input, String expected) {
        assertThat(rec1.parenBitLoop(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("nestParenArguments")
    void nestParen(String input, boolean expected) {
        assertThat(rec1.nestParen(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("strCopiesArguments")
    void strCopies(String input, String sub, int n, boolean expected) {
        assertThat(rec1.strCopies(input, sub, n), equalTo(expected));
    }

    public static Stream<Arguments> count8Arguments() {
        return Stream.of(
                Arguments.of(8, 1),
                Arguments.of(88, 3),
                Arguments.of(888, 5),
                Arguments.of(8828, 4),
                Arguments.of(1234, 0),
                Arguments.of(8228, 2)
        );
    }

    public static Stream<Arguments> countHi2Arguments() {
        return Stream.of(
                Arguments.of("ahixhi", 1),
                Arguments.of("ahibhi", 2),
                Arguments.of("xhixhi", 0),
                Arguments.of("", 0)
        );
    }

    public static Stream<Arguments> parenBitArguments() {
        return Stream.of(
                Arguments.of("xyz(abc)123", "(abc)"),
                Arguments.of("x(hello)", "(hello)"),
                Arguments.of("(xy)1", "(xy)")
        );
    }

    public static Stream<Arguments> nestParenArguments() {
        return Stream.of(
                Arguments.of("(())", Boolean.TRUE),
                Arguments.of("((()))", Boolean.TRUE),
                Arguments.of("(((x)))", Boolean.FALSE),
                Arguments.of("((())", Boolean.FALSE)
        );
    }

    public static Stream<Arguments> strCopiesArguments() {
        return Stream.of(
                Arguments.of("catcowcat", "cat", 2, true),
                Arguments.of("catcowcat", "cat", 1, true),
                Arguments.of("catcowcat", "cow", 2, false),
                Arguments.of("catcowcat", "cow", 1, true),
                Arguments.of("popop", "pop", 2, true),
                Arguments.of("popop", "pop", 1, true),
                Arguments.of("popop", "pop", 3, false)
        );
    }
}