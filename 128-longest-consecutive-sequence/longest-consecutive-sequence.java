class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0; i< nums.length;i++)
        {
            arr.add(nums[i]);
        }

        int maxx =0;

        for(int i =0;i<nums.length;i++)
        {
            int x = nums[i]-1;
            int curr =0;

            if(!arr.contains(x))
            {
                while(arr.contains(x+1))
                {
                    curr = curr+1;
                    x = x+1;
                }
                maxx = Math.max(maxx,curr);
            }
        }
        return maxx;
    }
}