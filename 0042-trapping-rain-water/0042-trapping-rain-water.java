class Solution {
    public int trap(int[] height) {
       // 4 2 0 5 2 6 2 3
        int len  = height.length ; 
        int lmax [] = new int[len] ;
        
        // calculating lmax 
        lmax[0] = height[0]; ;  
        for(int i =  1 ; i < len  ; i++)
        {
            lmax[i] = Math.max(lmax[i-1], height[i]); 
        }
        // 0 , 4 , 4 , 4 ,5 , 5, 6 ,6 
        int rmax[] = new int[len] ; 
        //calculating rmax 
        rmax[len-1] = height[len-1] ; 
        for(int j =  len-2  ; j >= 0 ; j--)
        {
            rmax[j] = Math.max(rmax[j+1], height[j]);
        }
        //  6,6,6,6,6,3,3,0

        
    
        int water[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            water[i] = Math.min(lmax[i], rmax[i]) - height[i];
        }

        int totalWater = 0;
         for(int i = 0; i < len; i++)
           {
              totalWater += water[i];
           }
           return totalWater ; 

        }
    }
