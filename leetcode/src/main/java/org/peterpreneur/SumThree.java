/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author peter
 */
public class SumThree {

    public static void main(String[] args) {
        // int[] nums = {1, 2, -2, -1};
        // int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {-2, 0, 1, 1, 2};
        // int[] nums = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10};
        System.out.println(threeSum(nums).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3 || nums.length > 3000) {
            return result;
        }

        //sort the array first to avoid duplicates
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 2; i++) {
            // System.out.println("i = " + nums[i] + " ---");

            // Do not reuse the same first value.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // The remaining values are also positive, so zero is impossible.
            if (nums[i] > 0) {
                break;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int total = nums[i] + nums[l] + nums[r];
                if (total == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));

                    l++;
                    r--;

                    // Skip repeated left and right values.
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (total < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}

