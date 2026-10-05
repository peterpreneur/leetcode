/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author peter
 */
public class LetterCombinations {

    public static void main(String[] args) {
        String input = "23";

        System.out.println(letterCombinations(input));

    }

    private static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        backtrack(digits, 0, new StringBuilder(), combinations);

        return combinations;
    }

    private static void backtrack(String digits, int index, StringBuilder current, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        PhoneDigits phoneDigits = PhoneDigits.fromDigit(digit);

        for (char letter : phoneDigits.getLetters()) {
            current.append(letter);

            backtrack(digits, index + 1, current, combinations);

            current.deleteCharAt(current.length() - 1);
        }
    }

    private enum PhoneDigits {
        TWO('2', new char[]{'a', 'b', 'c'}),
        THREE('3', new char[]{'d', 'e', 'f'}),
        FOUR('4', new char[]{'g', 'h', 'i'}),
        FIVE('5', new char[]{'j', 'k', 'l'}),
        SIX('6', new char[]{'m', 'n', 'o'}),
        SEVEN('7', new char[]{'p', 'q', 'r', 's'}),
        EIGHT('8', new char[]{'t', 'u', 'v'}),
        NINE('9', new char[]{'w', 'x', 'y'});

        private final char digit;
        private final char[] letters;

        PhoneDigits(char digit, char[] letters) {
            this.digit = digit;
            this.letters = letters;
        }

        public char getDigit() {
            return digit;
        }

        public char[] getLetters() {
            return letters.clone();
        }

        public static PhoneDigits fromDigit(char digit) {
            for (PhoneDigits key : values()) {
                if (key.digit == digit) {
                    return key;
                }
            }
            throw new IllegalArgumentException("Unsupported digit: " + digit);
        }

    }
}
