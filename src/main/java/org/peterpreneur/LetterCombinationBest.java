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
public class LetterCombinationBest {

    private static final String[] map = {
        "", "", "abc", "def",
        "ghi", "jkl", "mno",
        "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String digits = "23";
        letterCombination(digits);

    }

    public static List<String> letterCombination(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(0, digits, new StringBuilder(), ans);
        return ans;
    }

    private static void backtrack(int index, String digits, StringBuilder sb, List<String> ans) {

        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            sb.append(ch);

            backtrack(index + 1, digits, sb, ans);

            sb.deleteCharAt(sb.length() - 1);
        }

    }

}
