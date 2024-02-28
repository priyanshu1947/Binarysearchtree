class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int n = s.length();
        int left = 0;
        int right = 0;
        int len =0;

        while(right<n)
        {
            if(map.containsKey(s.charAt(right)))
            {
                left = Math.max(map.get(s.charAt(right))+1, left);
            }
                map.put(s.charAt(right), right);
                len = Math.max(right-left+1,len);
                right++;
                 
            
           
        }
         return len;
         
        

    }
}