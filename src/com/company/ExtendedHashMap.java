package com.company;

import java.util.HashMap;

/**
 * Created by mohit on 23-03-2015.
 */
public class ExtendedHashMap<String,V> extends HashMap<String,V> {


    /**
     * check for null
     *
     * @param key
     * @return
     */
    @Override
    public V get(Object key) {
        return super.get(key.toString().toLowerCase());
    }

    /**
     * keys will first converted to lowercase and then added to map
     *
     * @param key
     * @return
     */
    @Override
    public V put(String key, V value) {
        return super.put(key,value);
    }



}
