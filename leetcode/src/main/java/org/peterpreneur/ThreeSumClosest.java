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
public class ThreeSumClosest {

    public static void main(String[] args) {

        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3 || nums.length > 500) {
            throw new CustomExceptions("Array length must be between 3 and 500.");
        }

        if (target < -10_000 || target > 10_000) {
            throw new CustomExceptions("Target must be between -10,000 and 10,000.");
        }

        for (int number : nums) {
            if (number < -1_000 || number > 1_000) {
                throw new CustomExceptions("Each number must be between -1,000 and 1,000.");
            }
        }

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum == target) {
                    return currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
