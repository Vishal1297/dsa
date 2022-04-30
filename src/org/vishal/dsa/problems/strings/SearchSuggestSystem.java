package org.vishal.dsa.problems.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SearchSuggestSystem {

    public static void main(String[] args) {
        String[] products = {"bags", "baggage", "banner", "box", "cloths"};
        String searchWord = "xvcb";
        List<List<String>> result = suggestedProducts(products, searchWord);
        System.out.println("\nOutput : ");
        for (List<String> resArrayList : result) {
            System.out.println("size " + resArrayList.size());
            for (String string : resArrayList) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        String preffix = "";
        for (int i = 0; i < searchWord.length(); i++) {
            HashMap<String, ArrayList<String>> matchedProducts = new HashMap<>();
            preffix += searchWord.charAt(i) + "";
            for (String product : products) {
                if (product.startsWith(preffix)) {
                    ArrayList<String> prevWords =
                            matchedProducts.getOrDefault(preffix, new ArrayList<String>());
                    prevWords.add(product);
                    matchedProducts.put(preffix, prevWords);
                }
                if (!matchedProducts.containsKey(preffix)) {
                    matchedProducts.put(preffix, new ArrayList<String>());
                }
            }
            for (String matchedKey : matchedProducts.keySet()) {
                ArrayList<String> subResult = new ArrayList<String>(matchedProducts.get(matchedKey));
                Collections.sort(subResult);
                if (subResult.size() > 3) {
                    result.add(subResult.subList(0, 3));
                } else {
                    result.add(subResult);
                }
            }
        }
        return result;
    }
}
