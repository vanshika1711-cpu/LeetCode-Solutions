class Solution {
    public int maxArea(int[] height) {
        int len = height.length ; 
        int curr= 0 ; 
        int max = 0 ; 
        int left  = 0 ; 
        int right  = len-1 ; 
        for(int i = 0 ; i< len  ; i++)
        {
            int ht =  Math.min(height[left], height[right]); 
            int wt = right - left; 
            curr=  ht * wt ; 
            max  = Math.max(curr,max) ; 
            if(height[left]<height[right])
            {
                left++;
            }
            else 
            {
                right--  ; 
            }
        }
        return max ; 
    }
}