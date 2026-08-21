/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println("Longest Prefix: " + LongestPrefix(strs));

    }

    private static String LongestPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int charIndex = 0; charIndex < first.length(); charIndex++) {
            char charInFirst = first.charAt(charIndex);

            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                String s = strs[stringIndex];

                if (charIndex >= s.length() || s.charAt(charIndex) != charInFirst) {
                    return first.substring(0, charIndex);
                }
            }
        }
        return first;
    }
}
