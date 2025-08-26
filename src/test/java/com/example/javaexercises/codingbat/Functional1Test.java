package com.example.javaexercises.codingbat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class Functional1Test {

    private final Functional1 fun1 = new Functional1();

    @ParameterizedTest
    @MethodSource("doublingArguments")
    void doubling(List<Integer> input, List<Integer> expected) {
        assertThat(fun1.doubling(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("doublingArguments")
    void doublingFunc(List<Integer> input, List<Integer> expected) {
        assertThat(fun1.doublingFunc(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("squareArguments")
    void square(List<Integer> input, List<Integer> expected) {
        assertThat(fun1.square(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("addStarArguments")
    void addStar(List<String> input, List<String> expected) {
        assertThat(fun1.addStar(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("copies3Arguments")
    void copies3(List<String> input, List<String> expected) {
        assertThat(fun1.copies3(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("moreYArguments")
    void moreY(List<String> input, List<String> expected) {
        assertThat(fun1.moreY(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("noXArguments")
    void noX(List<String> input, List<String> expected) {
        assertThat(fun1.noX(input), equalTo(expected));
    }

    @ParameterizedTest
    @MethodSource("noXArguments")
    void noXMutable(List<String> input, List<String> expected) {
        assertThat(fun1.noX(input), equalTo(expected));
    }

    static Stream<Arguments> doublingArguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), List.of(2, 4, 6)),
                Arguments.of(List.of(6, 8, 6, 8, -1), List.of(12, 16, 12, 16, -2)),
                Arguments.of(List.of(), List.of())
        );
    }

    public static Stream<Arguments> squareArguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), List.of(1, 4, 9)),
                Arguments.of(List.of(6, 8, -6, -8, 1), List.of(36, 64, 36, 64, 1)),
                Arguments.of(List.of(), List.of())
        );
    }

    public static Stream<Arguments> addStarArguments() {
        return Stream.of(
                Arguments.of(List.of("a", "bb", "ccc"), List.of("a*", "bb*", "ccc*")),
                Arguments.of(List.of("*"), List.of("**")),
                Arguments.of(List.of(""), List.of("*")),
                Arguments.of(List.of(), List.of())
        );
    }

    public static Stream<Arguments> copies3Arguments() {
        return Stream.of(
                Arguments.of(List.of("a", "bb", "ccc"), List.of("aaa", "bbbbbb", "ccccccccc")),
                Arguments.of(List.of("24", "a", ""), List.of("242424", "aaa", "")),
                Arguments.of(List.of("hello", "there"), List.of("hellohellohello", "theretherethere"))
        );
    }

    public static Stream<Arguments> moreYArguments() {
        return Stream.of(
                Arguments.of(List.of("a", "b", "c"), List.of("yay", "yby", "ycy"))
        );
    }

    public static Stream<Arguments> noXArguments() {
        return Stream.of(
                Arguments.of(List.of("ax", "bb", "cx"), List.of("a", "bb", "c")),
                Arguments.of(List.of("x"), List.of("")),
                Arguments.of(List.of(), List.of())
        );
    }
}