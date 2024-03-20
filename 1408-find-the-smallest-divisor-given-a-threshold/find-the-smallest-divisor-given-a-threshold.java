public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 9};
        int threshold1 = 6;
        System.out.println(smallestDivisor(nums1, threshold1)); // Output: 5
        
        int[] nums2 = {44, 22, 33, 11, 1};
        int threshold2 = 5;
        System.out.println(smallestDivisor(nums2, threshold2)); // Output: 44
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MAX_VALUE;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = calculateSum(nums, mid);
            if (sum > threshold) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }

    public static int calculateSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double)num / divisor);
        }
        return sum;
    }
}
