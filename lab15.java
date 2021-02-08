package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class lab15 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("abc"));
        Iterator<Integer> iterate = set.iterator();
        System.out.println("traversing the hashSet:");
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}
