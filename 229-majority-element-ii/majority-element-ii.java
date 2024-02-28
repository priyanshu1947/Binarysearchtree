class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int min = (n/3)+1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            if(map.get(nums[i]) == min)
            {
                ans.add(nums[i]);
                // map.remove(nums[i]);
            }
        }
        return ans;
        
    }
}