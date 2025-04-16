class Solution {
    public boolean isPalindrome(int x) {
        int newNo = 0;
        int original = x;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int rem = x%10;
            newNo = newNo*10+rem;
            x = x/10;
        }
        if(newNo == original)
            {
                return true;
            }
        return false;
}
}