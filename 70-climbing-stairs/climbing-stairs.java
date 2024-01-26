class Solution {
    public int climbStairs(int n) {
        int [] f = new int [n+1];
        Arrays.fill(f, -1);

        return countways(n,f);
        
    } 
    private int countways(int n , int [] f)
    {
        if(n==0)
        return 1;
        if(n<0)
        return 0;

        if(f[n] != -1)
        {
            return f[n];
        }
        f[n] = countways(n-1,f)+countways(n-2,f);
        return f[n];
    }
    
}