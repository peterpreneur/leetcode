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
public class UseArraysSort {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        Arrays.sort(nums);

        int[] reversed = nums;

        System.out.println(Arrays.toString(reversed));
    }

}
