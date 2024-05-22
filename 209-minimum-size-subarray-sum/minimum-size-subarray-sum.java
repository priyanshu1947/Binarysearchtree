class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0; int end = 0; int window = Integer.MAX_VALUE;
        int curr_Sum = 0;
        for(end=0;end<nums.length;end++)
        {
            curr_Sum += nums[end];
            while(curr_Sum>=target)
            {
                window = Math.min(window, end-start+1);
                curr_Sum -= nums[start];
                start++;
            }
        }
        return window == Integer.MAX_VALUE ? 0 : window;
    }
}