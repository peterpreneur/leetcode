/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * @author peter
 */
public class Palindrome {

    public static void main(String[] args) {

        int x = 121;
        System.out.println("Palindrome is " + palindromeCheck(x));
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
}
