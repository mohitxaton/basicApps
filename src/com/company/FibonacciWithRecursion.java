package com.company;

/**
 * Created by mohit on 14-03-2015.
 */
public class FibonacciWithRecursion {


    public static void main (String[] args){

        int limit = 10;
        int[] a = new int[limit];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;

        for(int i = 3; i < 10; i++){
            a[i] = fibonacciRecursion(a[i-2], a[i-1]);
        }

        for(int i : a){
            System.out.print(i + ",");
        }

        try {
            Class.forName("dfsf");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    static int fibonacciRecursion(int fst, int second){
        return fst + second;
    }

}
