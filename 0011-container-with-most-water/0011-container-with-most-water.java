class Solution {
    public int maxArea(int[] height) {
    int len  =  height.length; 
    int i  = 0 ; 
    int j  = len-1  ; 
    int curr  = 0 ; 
    int max  = 0 ;  
    while(i<=j)
    {
        int min_height  = Math.min(height[i],height[j]) ;
        int breadth =  j - i ;  
        curr =  min_height * breadth ;  
        max  = Math.max(curr,max) ;
        if(height[i]<height[j])
        {
            i++ ;
        }
        else 
        {
            j-- ;
        }
        
    }
    return max ; 
}
}