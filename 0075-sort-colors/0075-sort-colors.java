class Solution {
    public void sortColors(int[] nums) {
        int len  =nums.length; 
        int mid = 0   ; 
        int low  =0  ; 
        int high  = len  - 1 ; 
        for(int i  =  0 ; i < len ; i++)
        {
            if(nums[mid]==0)
            {
                int temp = nums[mid] ; 
                nums[mid] = nums[low] ; 
                nums[low] = temp ; 
                mid++ ; 
                low++ ; 
            }
            else if (nums[mid]==1)
            {
                mid++ ;
            }
            else 
            {
                int temp = nums[mid] ; 
                nums[mid] = nums[high] ; 
                nums[high] = temp ; 
                high-- ; 
            }
        }

    }
}