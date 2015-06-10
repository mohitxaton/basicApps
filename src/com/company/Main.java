package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal a1 = new Animal();
        a1.setName("dog");
        Animal a2 = new Animal();
        a2.setName("horse");

        HashMap<Animal, Animal> m = new HashMap<>();

        m.put(a1,a1);
        m.put(a2,a2);

        System.out.println(m.get(a1).getName());

        System.out.println(10%5);
    }
}
