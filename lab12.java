package com.company;
import java.util.*;
class lab12 {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer number : numbers)
            System.out.print(number + " ");

        Iterator it = numbers.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}
