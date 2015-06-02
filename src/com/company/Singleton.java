package com.company;

/**
 * Created by mohit on 23-03-2015.
 */
public class Singleton {


    private static Singleton obj = null;


    private Singleton(){

    }


    public static Singleton getInstance(){
        if(obj != null){
            return obj;
        }

        synchronized (Singleton.class){
           if(obj == null){
             Singleton temp  = new Singleton();
               temp.init();
               obj = temp;
           }
       }
        return obj;
    }

    private void init() {
        // some init
    }
}
