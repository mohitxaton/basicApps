package com.company;

/**
 * Created by mohit on 22-03-2015.
 */
public class BubbleSort {




    public static void main(String[] args) {

        int[] array = {7,12,2,3,4,11,3,554,2,3,2,5,65,4,2};
//        int[] array = {5,4,3,2,1};
        int n, c, d, swap;

        for (c = 0; c < ( array.length - 1 ); c++) {
            for (d = 0; d < array.length - c - 1; d++) {
                if (array[d] > array[d+1]) /* For descending order use < */
                {
                    swap       = array[d];
                    array[d]   = array[d+1];
                    array[d+1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < array.length; c++)
            System.out.println(array[c]);

    }
}
