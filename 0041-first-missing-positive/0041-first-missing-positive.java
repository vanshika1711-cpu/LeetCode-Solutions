class Solution {
    public int firstMissingPositive(int[] nums) {
        int len  = nums.length  ; 
        // extra space 
        boolean seen[] = new boolean [len+1] ; 
        for(int i  = 0 ; i < len ; i++)
        {
            if(nums[i]>=1 && nums[i]<=len)
            {
                seen[nums[i]]= true  ; 
            }
        }
        // returning the index which is false 
        for(int i  = 1 ; i < seen.length  ; i++)
        {
            if(seen[i]==false)
            {
                return i ; 
            }
        }
        return len+1 ; 
    }
}