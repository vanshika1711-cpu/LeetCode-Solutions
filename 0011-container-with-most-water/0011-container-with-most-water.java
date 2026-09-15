class Solution {
    public int maxArea(int[] height) {
        int len  =  height.length ; 
        int left  = 0 ;  
        int right  = len-1 ; 
        int curr = 0   ; 
        int max  = 0 ; 
        while(left<=right)
        {
            int min_height = Math.min(height[left],height[right]) ;
            int breadth  =  right - left ;  
            curr = breadth * min_height ;
            if(curr>max)
            {
                max = curr ;
            }  
            if(height[left]<height[right])
            {
                left++ ;
            }
            else {
                right-- ;
            }


        }
        return max ;  
    }
}