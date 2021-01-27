public class BinarySearch {
    
    public static void main(String[] args) {
        int[] input = { 15, 23, 55, 90, 111, 124, 200 };
        int elementToFind = 111;
        int foundAt = search(input, elementToFind);
        if (foundAt != -1) {
            System.out.println("Element " + elementToFind + " Found At " + foundAt);
        } else {
            System.out.println("Element " + elementToFind + " Not Found");
        }
    }
    
    public static int search(int[] input, int element) {
        int len = input.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (input[mid] == element)
                return mid;
            if (input[mid] > element)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
