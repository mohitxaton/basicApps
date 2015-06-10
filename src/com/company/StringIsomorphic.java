package com.company;

/**
 * Created by mohitrathod on 6/7/15.
 */
public class StringIsomorphic {


    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));

        StringIsomorphic s = null;

        s.isIsomorphic("egg", "add");

    }




    public static boolean isIsomorphic(String s, String t) {
        if(s==null || t==null)
            return false;

        if(s.length() != t.length())
            return false;

        if(s.length()==0 && t.length()==0)
            return true;

        int consta = s.charAt(0) + t.charAt(0);
        boolean iso = true;
        for(int i = 0; i < s.length(); i ++){

            char t1 = s.charAt(i);
            char t2 = t.charAt(i);

            if(consta == t1+t2){
                continue;
            }else {
                iso = false;
                break;

            }
        }
        return iso;
    }

}
