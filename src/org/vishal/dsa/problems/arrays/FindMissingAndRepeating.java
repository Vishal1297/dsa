package org.vishal.dsa.problems.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMissingAndRepeating {

    public static void main(String[] args) {
        int N = 3;
        int[] arr = new int[] {1, 3, 3};
        int[] result = findTwoElement(arr, N);
        for (int num : result){
            System.out.println(num);
        }
    }

    public static int[] findTwoElement(int arr[], int n) {
        int sum = IntStream.of(arr).distinct().sum();
        int missingNum = (n * (n + 1))/2 - sum;
        HashMap<int[], Long> map = Stream.of(arr).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        int maxValueKey = Arrays.stream(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey()).max().orElse(0);
        return new int[] {maxValueKey,missingNum};
    }
}
