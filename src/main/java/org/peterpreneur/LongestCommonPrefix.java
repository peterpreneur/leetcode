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
        String[] strs = {"flower", "flow", "flight", null};

        System.out.println("Longest Prefix: " + longestCommonPrefix(strs));

    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String firstString = strs[0];

        for (int charIndex = 0; charIndex < firstString.length(); charIndex++) {
            char expectedCharacter = firstString.charAt(charIndex);

            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                String currentString = strs[stringIndex];

                if (currentString == null
                        || charIndex >= currentString.length()
                        || currentString.charAt(charIndex) != expectedCharacter) {
                    return firstString.substring(0, charIndex);
                }
            }
        }
        return firstString;
    }
}
