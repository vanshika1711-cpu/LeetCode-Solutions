class Solution {
    public int firstMissingPositive(int[] nums) {
        int len  = nums.length  ; 
        // remove unnecessary numbers 
        // 3 4 -1 1 
        for(int i  = 0 ;i < len ; i++)
        {
            if(nums[i]<=0)
            {
                nums[i]=len+1 ; 
            }
        }
        // 3 4 5 1 
        // mark negative 
        for(int i  = 0 ; i < len  ; i++)
        {
            int num  = Math.abs(nums[i]) ; 
            if(num<=len)
            {
                int idx  = num -1 ;  
                if(nums[idx]>0)
                {
                    nums[idx]*=-1 ; 
                }
            }
        }
        // check who is positive now ???
        for(int i  = 0 ; i < len ; i++)
        {
            if(nums[i]>0)
            {
                return i +1 ; 
            }
        }
        return len +1 ; 
    }
}