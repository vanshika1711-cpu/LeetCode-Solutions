class Solution {
    public boolean check(int[] nums) {
        int len  = nums.length ; 
        boolean IsSorted = true  ; 
        int peak = 0 ;  
        for(int i = 0 ; i < len -1 ; i++)
        {
            if(nums[i]>nums[i+1])
            {
                IsSorted = false ; 
                peak = peak  + 1 ; 
            }
        }
        if(peak==1 && nums[len-1]<=nums[0])
        {
            IsSorted = true ;  

        }
        if(peak>1)
        {
            IsSorted = false ; 
        }
        return IsSorted ;  
    }
}