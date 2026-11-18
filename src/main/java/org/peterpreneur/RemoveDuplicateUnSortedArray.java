package org.peterpreneur;

import java.util.Arrays;

public class RemoveDuplicateUnSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 3, 2, 1, 4, 1, 1, 3, 3, 2, 1, 4, 1 };
        System.out.println(Arrays.toString(nums));
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

        int k = removeDuplicatesUnSorted(nums);
        // nums = Arrays.copyOf(nums, k);
        System.out.print(k);
        System.err.print(", ");
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicatesUnSorted(int[] nums) {
        int k = 0;

        for (int read = 0; read < nums.length; read++) {
            boolean alreadyExists = false;

            for (int j = 0; j < k; j++) {
                if (nums[j] == nums[read]) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                nums[k] = nums[read];
                k++;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = 999;
        }

        return k;
    }
}
