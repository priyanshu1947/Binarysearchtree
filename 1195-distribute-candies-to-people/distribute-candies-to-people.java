class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int [] result = new int [num_people];
        int idx = 0;
        int curr_candies = 1;
        while(candies>0)
        {
            result[idx++] += curr_candies;
            candies -= curr_candies++;

            if(idx == num_people)
            {
                idx = 0;
            }
            if (curr_candies>candies)
            {
                curr_candies= candies;
            }
        }
        return result;
    }
}