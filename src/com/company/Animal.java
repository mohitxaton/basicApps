package com.company;

/**
 * Created by mohit on 20-03-2015.
 */
public class Animal {

    private String name;

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Animal)obj).getName().equalsIgnoreCase(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
