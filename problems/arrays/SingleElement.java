/**
 * ------------------------------ Single Element in a Sorted Array ------------------------------
 * 
 * Given a sorted array consisting of only integers where every element appears twice except for one
 * element which appears once. Find this single element that appears only once.
 * 
 * 
 * Example 1:
 * 
 * Input: [1,1,2,3,3,4,4,8,8] Output: 2
 * 
 * Example 2: Input: [3,3,7,7,10,11,11] Output: 10
 * 
 * 
 * Note:Your solution should run in O(log n)time*and O(1)space.
 */


public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 3, 8, 8, 9, 9, 10};
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1])
                    || (mid % 2 == 1 && nums[mid] == nums[mid - 1]))
                left = mid + 1;
            else
                right = mid;
        }
        System.out.println(nums[left]);
    }
}
