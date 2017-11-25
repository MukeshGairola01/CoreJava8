package com.mukesh.map;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * In ConcurrentHashMap if one thread is executing the method and same time another thread try to invoke that method any made some changes
 * it won't throw ConcurrentModification Exception. That is why ConcurrentHashMap is fail safe.
 * Anoter thing in CocurrentHaspMap , it aquire the lock on bucket level not on the whole map as HashMap does.
 * ConcurrentHaspMap will be used where the concurrency level is very high.
 * The default concurrency level is 16. Mean when you create the object of ConcurrentHashMap 16 bucket or segment will be created.
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args){
        //Map<Integer,String> myMap = new HashMap<Integer,String>();
        Map<Integer,String> myMap = new ConcurrentHashMap<Integer,String>();
        for(int i = 1; i <= 5; i++){
            myMap.put(i , "Person"+i);
        }

       Iterator<Map.Entry<Integer,String>> itr = myMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> data = itr.next();
            System.out.println(data.getKey() + "====>"+data.getValue());
            if("Person4".equals(data.getValue())) {
                myMap.put(8, "Hello");
            }
            }

        }
    }