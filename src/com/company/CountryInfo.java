package com.company;

import java.util.Map;

/**
 * Created by mohit on 23-03-2015.
 */
public class CountryInfo {



    public static Map<String, String> getCapitals(){

        ExtendedHashMap<String, String> stringMap = new ExtendedHashMap<String, String>();

        stringMap.put("india","Delhi");
        stringMap.put("netherlands","Ams");
        stringMap.put("sd","Ams");

        return stringMap;

    }


    public static void main(String[] args) {

        System.out.println(getCapitals().get("INdia"));

        for(String key : getCapitals().keySet()){
            System.out.println(key);
        }

    }
}
