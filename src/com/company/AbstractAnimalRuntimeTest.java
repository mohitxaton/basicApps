package com.company;

/**
 * Created by mohitrathod on 6/7/15.
 */
public class AbstractAnimalRuntimeTest {

    public static void main(String[] args) {

        AbstractAnimal a = new AbstractAnimal() {
            @Override
            public int eat() {
                return 1;
            }
        };

        System.out.println(a.eat());
    }


}
