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
        int[] nums = {-2,0,1,1,2};
        // int[] nums = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10};
        System.out.println(threeSum(nums).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3 || nums.length > 3000) {
            return new ArrayList<>();
        }

        //sort the array first to avoid duplicates
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<List<Integer>> list1 = new ArrayList<>();

        int arrayLen = nums.length;

        for (int i = 0; i < arrayLen; i++) {
            // System.out.println("i = " + nums[i] + " ---");

            for (int l = i + 1; l < arrayLen; l++) {
                // System.out.println("l = " + nums[l]);

                for (int r = arrayLen - 1; r > l; r--) {

                    if ((i != l) && (l != r) && (r != i)) {
                        System.out.println("i=" + i + " l=" + l + " r=" + r);

                        int total = nums[i] + nums[l] + nums[r];
                        if (total == 0) {

                            List<Integer> list2 = new ArrayList<>();
                            list2.add(nums[i]);
                            list2.add(nums[l]);
                            list2.add(nums[r]);

                            list1.add(list2);

                            break;
                        }
                    }
                }
            }
        }
        if (list1.isEmpty()) {
            return new ArrayList<>();
        } else {
            return list1.stream()
                    .map(group -> group.stream().sorted().toList())
                    .distinct()
                    .toList();
        }
    }

}
