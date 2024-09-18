class Solution {
    public int reverse(int x) {
        int revNum = 0;
        while(x!=0)
        {
            int LastDigit = x%10;
            if(revNum<Integer.MIN_VALUE/10 || revNum>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            revNum = revNum *10+LastDigit;
            x = x/10;
        }
        return revNum;
    }
}