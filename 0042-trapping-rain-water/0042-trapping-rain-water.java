class Solution {
    public int trap(int[] height) {
    // crunch of this question 
    // trap[i] = min(leftmax , rightmax)-height[i] ; 
    
        //  int len = height.length ; 
        // int lmax  = 0 ; 
        // int rmax  = 0  ; 
        // int water = 0 ; 
        // int maxheight = height[0]; 
        // int index = 0 ; 
        // // finding the maximum height 
        // for(int i = 0 ; i < len ; i++)
        // {
        //     if(height[i]>maxheight)
        //     {
        //         maxheight = height[i] ; 
        //         index = i ; 
        //     }
        // }
        // // calculating left part 
        // int left[] = new int[len] ; 
        // left[0] = height[0] ; 
        // for(int i = 0  ; i < index ; i++)
        // {
        //    if(height[i]<lmax)
        //    {
        //     water+=lmax-height[i] ; 
        //    }
        //    else 
        //    {
        //     lmax = height[i] ; 
        //    }
        // }
        // // calculating right part 
        // for(int j  = len-1 ; j > index ; j--)
        // {
        //      if(height[j]<rmax)
        //    {
        //     water+=rmax-height[j] ; 
        //    }
        //    else 
        //    {
        //     rmax = height[j] ; 
        //    }
        // }
        // return water ; 


         // [4,2,0,3,2,5]
        int len = height.length ; 
        int lmax[] = new int[len] ; 
        lmax[0] = height[0] ; 
        // calculating lmax 
        for(int i = 1 ; i < len  ; i++)
        {
          lmax[i] = Math.max(lmax[i-1],height[i]) ; 
        }
        int rmax[] = new int[len] ; 
        //calculating rmax 
        rmax[len-1] = height[len-1] ; 
        for(int j = len-2 ; j>=0 ; j--)
        {
            rmax[j] = Math.max(rmax[j+1], height[j]) ; 
        }

        //calculating water stored at each level 
        int water[]=  new int[len] ; 
        for(int k  = 0 ; k < len ; k++)
        {
            water[k] = Math.min(lmax[k],rmax[k])-height[k] ; 
        }
        int totalwater  = 0 ; 
        for(int l  = 0 ; l<len  ; l++)
        {
            totalwater += water[l] ; 
        }
        return totalwater ;
    
    }
}