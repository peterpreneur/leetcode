/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;
-
import java.util.Arrays;
/**
 *
 * @author peter
 */
public class UseStreamArraySort {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortedColors(nums);

        System.out.println(Arrays.toString(nums));

    }

    public static void sortedColors(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();

        System.arraycopy(sorted, 0, nums, 0, nums.length);
    }

}
