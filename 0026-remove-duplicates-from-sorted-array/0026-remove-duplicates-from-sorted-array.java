class Solution {
    public int removeDuplicates(int[] nums) {
        int len  =  nums.length ; 
        int i  =0 ; 
        for(int j = 0  ; j < len ; j++)
        {
          if(nums[j]!=nums[i])
          {
            i++ ; 
            nums[i] = nums[j] ; 
          }
        }
       return i+1 ; 
    }
}