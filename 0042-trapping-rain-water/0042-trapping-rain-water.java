class Solution {
    public int trap(int[] height) {
      // 1 -> finding out the maximum of all builduings 
      int len  = height.length  ; 
      int maxheight  = height[0] ;
      int index  = 0  ; 
      for(int i = 0 ; i < len ; i++)
      {
        if(height[i]>maxheight)
        {
            maxheight = height[i] ; 
            index = i ; 
        }
      }
      //left part 
      int lmax  = 0 ; 
      int water  = 0 ; 
      for(int i  = 0 ; i < index ; i++)
      {
        if(lmax>height[i])
        {
           water+=lmax-height[i] ; 
        } 
        else 
        {
            lmax  = height[i] ; 
        }

      }
      // right part  
      int rmax  =  0  ; 
        for(int i  = len-1;i>index  ;  i--)
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