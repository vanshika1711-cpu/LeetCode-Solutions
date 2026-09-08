class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i  = 0  ; 
        int len  = nums.length  ; 
        for(int j  = 0 ; j < len  ; j++)
        {
            if(nums[j]%2==0)
            {
                int temp  = nums[j] ; 
                nums[j] = nums[i] ;  
                nums[i] = temp ; 
                i++ ;
            }
        }
        return nums; 
    }
}