package com.company;

/**
 * Created by mohitrathod on 10/06/15.
 */
public class OverloadTest {

    void eat(String s){

    }

    void eat (Long l){

    }

    void eat (long l){

    }

    public static void main(String[] args) {

        OverloadTest overloadTest = new OverloadTest();

        //overloadTest.eat(null); //gives error

    }

}
