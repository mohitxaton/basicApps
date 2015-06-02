package com.company;

import java.util.ArrayList;
import java.util.List;

// filename: Main.java
class Test {
    static int i;
    int j;

    // start of static block
    static {
        i = 10;
        System.out.println("static block called " + Math.random());
    }
    // end of static block


    public static void main(String args[]) {


        List testList = new ArrayList();
        testList.add("one");
        testList.add("two");
        testList.add("three");

        for (int i = 0; i < testList.size(); i++) {

            System.out.println(testList.get(i));
            if (testList.get(i).equals("three")) {
                testList.remove("one");
            }
        }

        for (int i = 0; i < testList.size(); i++) {

            System.out.println(testList.get(i));

        }


        int x = -4;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(x = x >>> 1);
        System.out.println(Integer.toBinaryString(x));
        int y = 4;
        System.out.println(Integer.toBinaryString(y));
        System.out.println(y = y >>> 1);
        System.out.println(Integer.toBinaryString(y));
    }

    public static void printBinaryFormat(int number) {
        int binary[] = new int[25];
        int index = 0;
        while (number > 0) {
            binary[index++] = number % 2;
            number = number / 2;
        }
        System.out.println("binary of " + number);
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}