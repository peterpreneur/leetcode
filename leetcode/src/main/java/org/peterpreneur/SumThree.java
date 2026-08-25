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
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3 || nums.length > 3000) {
            System.out.println("Num size error");
        }

        //sort the array first to avoid duplicates
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<List<Integer>> list1 = new ArrayList<>();

        int arrayLen = nums.length;

        for (int i = 0; i < arrayLen; i++) {
            // System.out.println("i = " + nums[i]);

            skipleft:
            for (int l = 1; l < arrayLen - 1; l++) {
                // System.out.println("l = " + nums[l]);

                for (int r = arrayLen - 1; r > l; r--) {
                    // System.out.println("r = " + nums[r]);

                    int total = nums[i] + nums[l] + nums[r];
                    if (total == 0) {
                        System.out.println("i=" + i + " l=" + l + " r=" + r);
                        List<Integer> list2 = new ArrayList<>();
                        list2.add(nums[i]);
                        list2.add(nums[l]);
                        list2.add(nums[r]);
                        System.out.println("list2=" + list2.toString());

                        list1.add(list2);
                        System.out.println("list1=" + list1.toString());
                        System.out.println("-----");

                        i++;
                        break skipleft;
                    }
                }
            }
        }
        if (list1.isEmpty()) {
            return null;
        } else {
            return list1.stream()
                    .map(group -> group.stream().sorted().toList())
                    .distinct()
                    .toList();
        }
    }

}
