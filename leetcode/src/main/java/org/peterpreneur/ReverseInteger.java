/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int number = 1534236469;

        System.out.println(reverse(number));

    }

    public static int reverse(int x) {

        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; // get last digit
            x = x / 10;          // remove last digit

            if (reversed > Integer.MAX_VALUE / 10
                    || (reversed == Integer.MAX_VALUE / 10 && digit > 7)
                    || reversed < Integer.MIN_VALUE / 10
                    || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;

        }

        return reversed;

    }

}
