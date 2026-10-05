/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class RomanToInteger {

    public static void main(String[] args) {

        String input = "IV";
        int output = romanToInt(input);
        System.out.println("final: " + output);
    }

    private static int romanToInt(String input) {
        int total = 0;
        int prevValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            RomanNumeral numeral = RomanNumeral.valueOf(String.valueOf(input.charAt(i)));

            int currentValue = numeral.getNum();

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;

        }
        return total;
    }

    private enum RomanNumeralOnly {
        I,
        V,
        X,
        L,
        C,
        D,
        M;
    }

    private enum RomanNumeral {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private int num;

        private RomanNumeral(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

    }
}
