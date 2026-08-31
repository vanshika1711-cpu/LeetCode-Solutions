class Solution {
    public int[] runningSum(int[] nums) {
        int len  = nums.length  ; 
        // int arr[] = new int[len] ;
        // int sum = 0 ; 
        // for(int i  = 0 ; i < len  ; i++)
        // {
        //     sum =  sum  + nums[i] ; 
        //     arr[i] = sum ; 
        // }
        // return arr; 

        for(int i  = 1 ; i < len ; i++)
        {
            nums[i] = nums[i]+ nums[i-1] ; 
        }
       return nums ;
    }
}