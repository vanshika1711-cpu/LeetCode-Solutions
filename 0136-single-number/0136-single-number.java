class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length ; 
        Arrays.sort(nums) ; 
        for(int i  = 0 ; i < len-1 ; i+=2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i] ; 
            }
        }
        return nums[len-1]; 
    }
}