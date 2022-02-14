public class TwoSum2 {
    public static void main(String[] args) {
        int input[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twoSum(input, target);
        System.out.println(result[0]+" "+result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        if (n == 1)
            return new int[] {-1, -1};
        int left = 0, right = n - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target)
                right--;
            else if (numbers[left] + numbers[right] < target)
                left++;
            else
                return new int[] {left + 1, right + 1};
        }
        return new int[] {-1, -1};
    }
}
