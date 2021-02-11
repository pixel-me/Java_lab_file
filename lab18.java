package com.company;

import java.util.*;

public class lab18 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("ghanshyam", "33033");
        map.put("ankit", "12299");
        map.put("me", "12299");
        map.put("ds sahu", "73987");
        map.put("mota", "33033");

        System.out.printf("Before: %s%n", map);
        Set<String> mySet = new HashSet<>();

        for (Iterator itr = map.entrySet().iterator(); itr.hasNext();)
        {
            Map.Entry entrySet = (Map.Entry) itr.next();

            String value = (String) entrySet.getValue();

            if (!mySet.add(value))
            {
                itr.remove();
            }
        }
        System.out.printf("After: %s%n", map);
    }
}
