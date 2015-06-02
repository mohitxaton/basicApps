package com.company;

/**
 * Created by mohit on 17-03-2015.
 */
public class StringInverseRecursion {


    public static void main (String[] args) throws Exception
    {
        // your code goes here

        String input = "abcdefghi";

        char [] arr = input.toCharArray();

        char [] revArr = new char[arr.length];

        int counter = arr.length;

        reverceRecursion(arr, counter, revArr);

        System.out.println(String.valueOf(revArr));

    }


    static void reverceRecursion(char [] arg, int counter, char [] revArr){

        counter--;
        revArr[(arg.length - counter) - 1] = arg[counter];
        if(counter > 0){
            reverceRecursion(arg, counter, revArr);
        }
    }

}
