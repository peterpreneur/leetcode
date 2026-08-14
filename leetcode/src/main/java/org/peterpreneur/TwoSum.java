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
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("nums must not be null");
        }

        if (nums.length < 2 || nums.length > 10000) {
            throw new IllegalArgumentException("nums.length must be between 2 and 10000");
        }

        if (target < -1_000_000_000 || target > 1_000_000_000) {
            throw new IllegalArgumentException("target out of range: " + target);
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < -1_000_000_000 || nums[i] > 1_000_000_000) {
                throw new IllegalArgumentException("nums[i] out of range: " + nums[i]);
            }

            for (int j = i + 1; j < nums.length;
                    j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalStateException("No result was found");

    }
}
