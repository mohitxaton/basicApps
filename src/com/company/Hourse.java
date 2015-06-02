package com.company;

/**
 * Created by mohit on 20-03-2015.
 */
public class Hourse extends Animal{


    public void eat(){
        System.out.println("a");
    }


    public void run(){
        System.out.println("run");
    }


    public static void main(String[] args) {


        Animal a = new Hourse();
        ((Hourse)a).run();
    }
}
