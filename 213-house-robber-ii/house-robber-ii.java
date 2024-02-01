class Solution {
    public int function(ArrayList<Integer> nums) {
        int n = nums.size();
        int prev = nums.get(0);
        int prev2 = 0;
        int prev1 =0;

        for(int i = 1; i < n; i++) {
            int take = nums.get(i);

            if(i > 1) {
                take += prev1;
            }

            int ntake = prev;

            int curri = Math.max(take, ntake);
            prev1 = prev;
            prev = curri;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) {
            return nums[0];
        }

        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(i != 0) {
                temp1.add(nums[i]);
            }
            if(i != n - 1) {
                temp2.add(nums[i]);
            }
        }
        return Math.max(function(temp2), function(temp1));
    }
}