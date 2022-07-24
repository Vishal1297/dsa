package org.vishal.dsa.problems.arrays;

public class KthSmallest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int kth = 0;
        System.out.println(kthSmallest(arr, 0, arr.length - 1, kth));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        if (l < r){
            int pi = partition(arr, l, r, arr[r]);
            if (pi < k - 1) {
                return kthSmallest(arr, pi + 1, r, k);
            } else if (pi > k - 1) {
                return kthSmallest(arr, l, pi - 1, k);
            } else {
                return arr[pi];
            }
        }
        return arr[k - 1];
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low;
        int j = low;
        while (i <= high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] > pivot) {
                i++;
            }
        }
        return j - 1;
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) return;
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
