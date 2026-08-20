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
        // System.out.println(RomanNumeralOnly.C);
        // System.out.println(RomanNumeralOnly.C.ordinal());
        // RomanNumeralOnly[] ss = RomanNumeralOnly.values();
        // for (RomanNumeralOnly s : ss) {
        //     System.out.println(s);
        // }

        // System.out.println(RomanNumeral.C.getNum());
        // RomanNumeral[] roman = RomanNumeral.values();
        // for (RomanNumeral r : roman) {
        //     System.out.println(r);
        //     System.out.println(r.num);
        //     System.out.println(r.ordinal());
        // }
        String inputI = "I";
        RomanNumeral romanI = RomanNumeral.valueOf(String.valueOf(inputI));
        System.out.println(romanI);
        System.out.println(romanI.getNum());



        String input = "III";
        // int output;

        // //need to check from left to right. convert string to char
        // char[] charInput = input.toCharArray();

        // for (char cInput: charInput) {

        // }


        // III - 
        // IV - 4
        // X = 10
        // System.out.println(output);
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
