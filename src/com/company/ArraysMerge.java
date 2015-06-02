package com.company;

/**
 * Created by mohit on 21-03-2015.
 */
public class ArraysMerge {


    public static void main(String[] args) {

        String[] a1 = {"1"};
        String[] a2 = {};

        int totalLength = a1.length + a2.length;
        String[] totalArr = new String[totalLength];

        int indexA1 = 0;
        int indexA2 = 0;
        for(int i = 0; i < totalLength; i++){

            if((indexA1 < a1.length) && (indexA2 < a2.length)){

                if(i%2 == 0){
                    totalArr[i] = a1[indexA1];
                    indexA1++;
                }else {
                    totalArr[i] = a2[indexA2];
                    indexA2++;
                }

            }else if(indexA1 < a1.length){
                totalArr[i] = a1[indexA1];
                indexA1++;
            }else if(indexA2 < a2.length) {
                totalArr[i] = a2[indexA2];
                indexA2++;
            }
        }


        for(String s : totalArr){
            System.out.println(s);
        }

    }
}
