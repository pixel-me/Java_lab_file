package com.company;

import java.util.*;

public class lab16 {
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(30);

        System.out.println("Before sort: " + set);

        ArrayList<Integer> array = new ArrayList<>(set);

        Collections.sort(array);

        System.out.println("After sort: " + array);
    }
}
