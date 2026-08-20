/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * @author peter
 */
public class Palindrome {

    public static void main(String[] args) {

        int x = 1234;
        System.out.println("isPalindrome is " + isPalindrome(x));
        System.out.println("int value is " + x);
        System.out.println("Palindrome of " + x + " is " + palindromeCheck(x));
        System.out.println("reverseWithStringBuilder is " + reverseWithStringBuilder(x));
        System.out.println("reverseWithCharArray is " + reverseWithCharArray(x));
        System.out.println("reverseWithCollections is " + reverseWithCollections(x));
    }

    private static boolean isPalindrome(int x) {

        String text = String.valueOf(Math.abs(x));
        String reversed = new StringBuilder(text).reverse().toString();
        return (text == null ? reversed == null : text.equals(reversed));

    }

    private static boolean palindromeCheck(int num) {
        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    private static int reverseAritmatic(int num) {
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return sign * reversed;     //1 * 3
    }

    private static int reverseWithStringBuilder(int num) {
        String text = String.valueOf(Math.abs(num));
        String reversed = new StringBuilder(text).reverse().toString();
        return Integer.parseInt(reversed);
    }

    private static int reverseWithCharArray(int num) {
        char[] digits = String.valueOf(Math.abs(num)).toCharArray();

        StringBuilder reversed = new StringBuilder();

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed.append(digits[i]);
        }

        return Integer.parseInt(reversed.toString());

    }

    private static int reverseWithCollections(int num) {
        String text = String.valueOf(Math.abs(num));

        List<Integer> digits = new ArrayList<>();

        for (char ch : text.toCharArray()) {
            digits.add(ch - '0');
        }

        int reversed = 0;

        for (int digit : digits.reversed()) {
            reversed = reversed * 10 + digit;
        }

        return reversed;

    }

}
