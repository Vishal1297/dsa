package org.vishal.dsa.problems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingAndRepeating {

    public static void main(String[] args) {
        int N = 6;
        int[] arr = new int[]{1, 2, 3, 4, 5, 5};
        int[] result = findTwoElement(arr, N);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] findTwoElement(int arr[], int n) {
        int sum = IntStream.of(arr).distinct().sum();
        int missingNum = (n * (n + 1)) / 2 - sum;
        HashMap<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        map.forEach((key, value) -> System.out.println("key " + key + " value " + value));
        int maxValueKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return new int[]{maxValueKey, missingNum};
    }
}
