class Solution {
    public int maximumGap(int[] nums) {
        int curr  = 0 ; 
        int max = 0 ; 
        int len = nums.length ; 
        Arrays.sort(nums);
        for(int i= 0 ; i < len-1 ; i++)
        {
         curr = nums[i+1] - nums[i] ; 
         if(curr>max)
         {
            max= curr ; 
         }
        }
        return max = Math.max(curr,max) ; 
    }
}