class Solution {
    public int trap(int[] height) {
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