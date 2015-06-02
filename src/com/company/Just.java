package com.company;

import java.util.Iterator;

public class Just {

    public static void main(String[] args) {
//        System.out.println("again value of t ="+t);



        Iterator<Thread> i = Thread.getAllStackTraces().keySet().iterator();

        while (i.hasNext()){
            Thread t = i.next();
            System.out.println(t.getName());
        }
    }



}