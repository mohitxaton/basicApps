package com.company;

import java.util.Arrays;

/**
 * Created by mohitrathod on 6/7/15.
 */
public class RotateArray {


    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int [] array  = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(array, k);

        System.out.println(Arrays.toString(array));


    }

}


