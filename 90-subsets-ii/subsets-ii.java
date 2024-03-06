class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        fun(0,nums,new ArrayList<>(), ansList);
        return ansList;
    }

    public void fun(int ind, int[] nums, List<Integer> ds, List<List<Integer>> anslist)
    {
        anslist.add(new ArrayList<>(ds));
        for(int i =ind;i<nums.length;i++)
        {
            if(i> ind && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            fun(i+1,nums,ds,anslist);
            ds.remove(ds.size()-1);
        }
    }
}