package com.example.javaexercises.codingbat;

public class Recursion1 {

    public int count8(int n) {
        return count8Rec(n, false);
    }

    private int count8Rec(int n, boolean lastDigitEight) {
        if (n == 0) return 0;

        boolean curDigitEight = n % 10 == 8;
        int add = 0;
        if (curDigitEight) {
            add++;
            if (lastDigitEight) add++;
        }

        return add + count8Rec(n / 10, curDigitEight);
    }

    public int countHi2(String str) {
        if (str.length() < 2) return 0;

        char fst = str.charAt(0);
        char snd = str.charAt(1);
        if (fst == 'x' && snd == 'h') return countHi2(str.substring(2));
        if (fst == 'h' && snd == 'i') return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }

    /**
     * Given a string that contains a single pair of parenthesis, compute recursively a new string made of only
     * the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
     */
    public String parenBit(String str) {
        if (str.charAt(0) != '(') return parenBit(str.substring(1));
        if (str.charAt(str.length() - 1) != ')') return parenBit(str.substring(0, str.length() - 1));
        return str;
    }

    public String parenBitLoop(String str) {
        if (str.charAt(0) == '(') {
            int i = 1;
            while (str.charAt(i) != ')') {
                i++;
            }
            return str.substring(0, i + 1);
        }

        return parenBit(str.substring(1));
    }

    /**
     *
     * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
     * Suggestion: check the first and last chars, and then recur on what's inside them.
     */
    public boolean nestParen(String str) {
        if (str.length() == 0) return true;
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear
     * in the string somewhere, possibly with overlapping. N will be non-negative.
     */
    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) return true;
        if (str.length() < sub.length()) return false;
        if (str.startsWith(sub)) {
            return strCopies(str.substring(1), sub, n - 1);
        }
        return strCopies(str.substring(1), sub, n);
    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends
     * with sub and return its length.
     */
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;

        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) return str.length();
            return strDist(str.substring(0, str.length() - 1), sub);
        } else {
            return strDist(str.substring(1), sub);
        }
    }
}
