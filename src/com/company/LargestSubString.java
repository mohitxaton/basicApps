package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mohit on 17-05-2015.
 */
public class LargestSubString {

    public static final int INDEX_NOT_FOUND = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String cases = br.readLine();
        String cases = "1";

        for(int i = 0; i < Integer.parseInt(cases); i++){

            /*String data = br.readLine();
            String arr [] = data.split(" ");
            String stringData =  arr[0];
            int  k =  Integer.parseInt(arr[1]);*/

//            Long x =  arr[0];
//            x.longValue();

            String stringData =  "setupsetpreset";
            int  k =  Integer.parseInt("7");

            boolean foundValidData = false;

            int biggestIndex = stringData.length()/3;

            for(int j = biggestIndex; j > 0; j--){

                String substr = stringData.substring(0, j);

                // now search at end

                if(stringData.endsWith(substr) && ((stringData.indexOf(substr, substr.length()) + substr.length()) <= k)){
                    System.out.println(substr);
                    foundValidData = true;
                    break;
                }else {
                    // blank
                }

                /*if(countMatches(stringData, substr) == 3){
                    if(stringData.endsWith(substr)){
                        if((stringData.indexOf(substr, substr.length()) + substr.length()) <= k) {
                            System.out.println(substr);
                            foundValidData = true;
                            break;
                        }
                    }
                } else {
                    // blank
                }*/
            }

            if(!foundValidData){
                System.out.println("Puchi is a cheat!");
            }


        }

    }

    public static int countMatches(String str, String sub) {
        if (isEmpty(str) || isEmpty(sub)) {
            return 0;
        }
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != INDEX_NOT_FOUND) {
            count++;
            idx += sub.length();
        }
        return count;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }


}
