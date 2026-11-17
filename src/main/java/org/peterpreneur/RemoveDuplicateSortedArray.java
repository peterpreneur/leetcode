package org.peterpreneur;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        System.out.println(Arrays.toString(nums));

        int k = removeDuplicates(nums);
        System.out.print(k);
        System.err.print(", ");
        System.out.println(Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
