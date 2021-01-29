
/* 
    rotate(arr[], d, n)
        reverse(arr[], 1, d) ;
        reverse(arr[], d + 1, n);
        reverse(arr[], 1, n);
*/

public class ReversalAlgo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length; 
        int rotateValue = 2; 

        leftRotate(arr, rotateValue, len); // Rotate array by d 
        printArray(arr); 
    }

    private static void printArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) 
            System.out.print(arr[index] + " ");
        System.out.println();
    }

    private static void leftRotate(int[] arr, int rotateValue, int len) {
        if (rotateValue == 0) 
            return; 
          
        rotateValue = rotateValue % len; 
        reverseArray(arr, 0, rotateValue - 1); 
        reverseArray(arr, rotateValue, len - 1); 
        reverseArray(arr, 0, len - 1); 
    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}