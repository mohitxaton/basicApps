package com.company;

/**
 * Created by mohit on 17-03-2015.
 */
public class ConvertOneBaseToAnother {


    public void parseNumber2(String a) {


            parseNumber("a");


        return;
    }


    public void parseNumber(String a) throws NullPointerException{
        throw new NullPointerException();
    }

    public static void main(String[] args) {

        int x = 5;
        System.out.println(Integer.toString(x, 2));
        System.out.println(Integer.toString(x, 8));
        System.out.println(Integer.toString(x, 16));

        System.out.println(Integer.toString(x, 1));

        System.out.println(Integer.toString(-17, 16));


        ConvertOneBaseToAnother convertOneBaseToAnother = new ConvertOneBaseToAnother();
        convertOneBaseToAnother.parseNumber2("a");
//        Integer.toString(Integer.parseInt(number, base1), base2);

    }





}
