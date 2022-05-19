package org.vishal.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row : result){
            for (Integer value : row){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = null;
        ArrayList<Integer> pre = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            current = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || j == i) {
                    current.add(1);
                }else {
                    current.add(pre.get(j) + pre.get(j - 1));
                }
            }
            pre = current;
            result.add(current);
        }
        return result;
    }
}
