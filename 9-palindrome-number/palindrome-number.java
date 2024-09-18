class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int a = x;
        while(x>0)
        {
            int LastDigit = x%10;
            rev = rev*10+LastDigit;
            x = x/10;
        }
        if(rev ==a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}