package com.mukesh.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Mukesh");
        list.add("Jhon");
        list.add("Roy");

        /**
         * This will print the complete list
         */
        list.stream().forEach(e->{
            System.out.println(e);
        });

        /**
         * This will fetch only the element where condition match
         */
        System.out.println("==============================");
        list.stream().filter(ee-> "Mukesh".equals(ee)).forEach(e->{
            System.out.println(e);
        });
    }
}
