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
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        int[] reversed = nums;

        for (int n : reversed) {
            System.out.println(n);
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0;    //next position for 0
        int mid = 0;    // current element
        int high = nums.length - 1; //next position for 2

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                default:
                    // nums[mid] == 2
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }

    }

    private static void swap(int[] nums, int low, int mid) {
        int temp = nums[low];   //temp store value of nums[low] to temp
        nums[low] = nums[mid];  //copy value of nums[mid] to nums[low]
        nums[mid] = temp;       //copy value of temp to nums[mid]    
    }

}
