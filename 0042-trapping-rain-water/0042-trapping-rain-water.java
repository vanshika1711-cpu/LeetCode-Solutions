class Solution {
    public int trap(int[] height) {
        int len = height.length ; 
        int lmax  = 0 ; 
        int rmax  = 0  ; 
        int water = 0 ; 
        int maxheight = height[0]; 
        int index = 0 ; 
        // finding the maximum height 
        for(int i = 0 ; i < len ; i++)
        {
            if(height[i]>maxheight)
            {
                maxheight = height[i] ; 
                index = i ; 
            }
        }
        // calculating left part 
        int left[] = new int[len] ; 
        left[0] = height[0] ; 
        for(int i = 0  ; i < index ; i++)
        {
           if(height[i]<lmax)
           {
            water+=lmax-height[i] ; 
           }
           else 
           {
            lmax = height[i] ; 
           }
        }
        // calculating right part 
        for(int j  = len-1 ; j > index ; j--)
        {
             if(height[j]<rmax)
           {
            water+=rmax-height[j] ; 
           }
           else 
           {
            rmax = height[j] ; 
           }
        }
        return water ; 

    }
}