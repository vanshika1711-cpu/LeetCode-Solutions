class Solution {
    public int majorityElement(int[] nums) {
       //moore's voting algorithm  
       int vote  =  0 ; 
       int candidate  = nums[0] ; 
       int len  = nums.length  ;

       for(int i  = 0 ; i < len  ; i++)
       {
        if(vote==0)
        {
            candidate = nums[i] ;
        }
        if(candidate==nums[i])
        {
           vote++ ;  
        }
        else 
        {
            vote-- ;
        }
       }
       return candidate ; 
    }
}