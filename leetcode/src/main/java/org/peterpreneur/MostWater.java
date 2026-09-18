/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.peterpreneur;

/**
 *
 * @author peter
 */
public class MostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        for (int i = 0; i < n; i++) {
            int max = i * height[i];
            System.out.println(max);

        }

        return 1;
    }

}
