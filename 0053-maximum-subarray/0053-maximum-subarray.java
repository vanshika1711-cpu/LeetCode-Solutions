class Solution {
    public int maxSubArray(int[] nums) {
        // kadame algorithm 
        //  [-2,1,-3,4,-1,2,1,-5,4]
    int len  = nums.length ; 
    int maxsum = Integer.MIN_VALUE ; 
    int sum  = 0  ; 
    for(int i  = 0 ; i < len ; i++)
    {
        
        sum  = sum  + nums[i] ; 
        
        if(sum>maxsum)
        {
            maxsum  = sum ; 
        }

        if(sum<0)
        {
            sum=0 ; 
        }

    }
    return maxsum ; 
    }
}