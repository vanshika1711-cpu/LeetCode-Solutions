class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length ; 
        boolean seen[] = new boolean[len+1] ; 
        //    [3 4 -1 1 ]
        for(int i  = 0 ; i < len ; i++)
        {
            if(nums[i]>=1 && nums[i]<=len)
            {
                seen[nums[i]]= true  ; 
            }
        }
        for(int i  = 1 ; i <= len ; i++)
        {
            if(seen[i]==false)
            {
                return  i ; 
            }
        }
        return len + 1 ; 
    }
}