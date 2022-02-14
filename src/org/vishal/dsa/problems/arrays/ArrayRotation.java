public class ArrayRotation {

    public static void main(String[] args) {

        int[] input = { 8, 3, -4, 11, 4, 0 };
        int rotateValue = 2;

        rotateArray(input, rotateValue);

        for (int val : input)
            System.out.print(val + " ");
        System.out.println();
    }
    
    public static void rotateArray(int[] input, int rotateValue) {
        for (int index = 0; index < rotateValue; index++) {
            int temp = input[0];
            int i = 1;
            for (; i < input.length; i++) {
                input[i - 1] = input[i];
            }
            input[i - 1] = temp;
        }
    }
}