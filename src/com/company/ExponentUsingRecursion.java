package com.company;

/**
 * Created by mohit on 22-03-2015.
 */
public class ExponentUsingRecursion {

    public static int exp(int pow, int num) {
        if (pow < 1){
            System.out.println(1);
            return 1;
        }else{
            System.out.println(num + "," + pow );
            return num * exp(pow-1, num) ;
        }
    }

    public static void main (String [] args) {
        System.out.println (exp (3, 3));
    }

}
