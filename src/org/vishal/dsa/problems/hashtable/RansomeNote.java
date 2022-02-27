package org.vishal.dsa.problems.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomeNote {

    public static void main(String[] args) {
        List<String> magazine = Arrays.asList("ive", "got", "a", "got");
        List<String> note = Arrays.asList("ive", "got", "a");
        isRansomeNote(magazine, note);
    }

    public static void isRansomeNote(List<String> magazine, List<String> note) {
        HashMap<String, Long> magMap = magazine.stream().collect(
                Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        HashMap<String, Long> noteMap = note.stream().collect(
                Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        for (String key : noteMap.keySet()) {
            if (magMap.get(key) == null
                    || noteMap.get(key) > magMap.get(key)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
