package com.example.javaexercises.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).collect(Collectors.toList());
    }

    public List<Integer> doublingFunc(List<Integer> nums) {
        return nums.stream().map(this::doubleInt).toList();
    }

    private Integer doubleInt(Integer num) {
        return num * 2;
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(x -> x * x).toList();
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").toList();
    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).toList();
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").toList();
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    /**
     Given a list of strings, return a list where each string has all its "x" removed.

     noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
     noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
     noX(["x"]) → [""]
     */
    public List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replaceAll("x", "")).toList();
    }

    public List<String> noXMutable(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}
