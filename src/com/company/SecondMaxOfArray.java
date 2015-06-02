package com.company;

/**
 * Created by mohit on 15-03-2015.
 */
public class SecondMaxOfArray {


    public SecondMaxOfArray(){
    }

    public static void main(String[] args) {

        int [] a = {5,6,7,1,32,6,985,12,2,56};

        int max = 0;
        int secondMax = 0;



        for (int i = 0; i < a.length; i++){

            if(max < a[i]){
                secondMax = max;
                max = a[i];
            }else if(secondMax < a[i]){
                secondMax = a[i];
            }
        }

        System.out.println(secondMax + " <");

    }

}
