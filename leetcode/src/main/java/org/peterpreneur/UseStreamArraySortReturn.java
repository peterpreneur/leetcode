/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.Arrays;

/**
 *
 * @author peter
 */
public class UseStreamArraySortReturn {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println(Arrays.toString(sortedColors(nums)));
    }

    public static int[] sortedColors(int[] nums) {
        return Arrays.stream(nums).sorted().toArray();
    }

}
