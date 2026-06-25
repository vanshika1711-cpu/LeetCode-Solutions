class Solution {
    public int trap(int[] height) {
        int len  = height.length  ; 
        int lmax  = 0  ; 
        int rmax  = 0 ; 
        int water = 0; 
        // for finding max height 
        int maxheight = height[0] ; 
        int index  = 0  ; 
        // calculating max height builduing 
        for(int i  = 1 ; i < len  ; i++)
        {
            if(height[i]>maxheight)
            {
                maxheight = height[i] ; 
                index  =i ; 
            }
        }
        //calculating left part 
        for(int i = 0 ; i <index ; i++)
        {
          if(lmax > height[i])
          {
            water+=lmax-height[i] ; 
          }
          else 
          {
            lmax = height[i] ; 
          }
        }
        //calculating right part
        for(int i  = len-1 ; i>index ; i--)
        {
            if(rmax>height[i])
            {
                water+=rmax-height[i] ; 

            }
            else 
            {
                rmax  = height[i] ; 
            }
        }
        return water ; 
    }
}