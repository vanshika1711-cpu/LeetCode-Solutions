class Solution {
    public boolean check(int[] nums) {
        boolean vanshu  = true ; 
        int len = nums.length; 
        int peak  = 0  ;
        for(int i  =0 ; i < len-1  ; i++)
        {
           if(nums[i]>nums[i+1])
           {
                vanshu  = false ; 
                peak = peak +1 ; 
           }
        }
        if (peak==1 && nums[len-1]<=nums[0])
        {
            vanshu = true;
        }
        if(peak>1)
        {
            vanshu = false ;
        }
        return vanshu;
            }
}