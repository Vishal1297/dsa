package org.vishal.dsa.problems.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyinteger(list));
    }

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> intSet = new HashSet<>(a);
        int setSum = (intSet.stream().mapToInt(value -> value)).sum();
        int listSum = (a.stream().mapToInt(integer -> integer)).sum();
        return (2 * setSum) - listSum;
    }
}
