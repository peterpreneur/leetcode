/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

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
        if (nums.length < 3 || nums.length > 500) {
            throw new CustomExceptions("Wrong length.");
        }

        if (target < -Math.pow(10, 4) || target > Math.pow(10, 4)) {
            throw new CustomExceptions("Invalid target.");
        }

        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < -1000 || nums[i] > 1000) {
                throw new CustomExceptions("Invalid value.");
            }

            int total = nums[i] + nums[i + 1] + nums[i + 2];
            int diff = Math.abs(total - target);

            if (i == 0 || diff < result) {
                result = diff;
            }
        }

        return result;
    }
}
