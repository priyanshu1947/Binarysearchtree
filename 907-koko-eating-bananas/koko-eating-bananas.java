class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0;
        int high = -1;
        int k = 0;

        int n = piles.length;
        for(int i =0; i<n;i++)
        {
            high = Math.max(high, piles[i]);
        }

        while(low< high)
        {
            int mid = low + (high-low)/2;
            k =0;

            for(int j =0; j<n;j++)
            {
                int val = piles[j];
                k += Math.ceil((double) val / mid);
            }
            if(k<= h)
            {
                high = mid;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
}