class Solution {
    public int longestConsecutive(int[] nums) {
        int len  = nums.length  ; 
        HashSet<Integer>set  = new HashSet<>() ; 
        if (len == 0 )
        {
            return 0 ; 
        }
        for(int i  = 0 ; i < len  ; i++)
        {
            set.add(nums[i]) ;
        }
        int longest  = 1 ; 
        
        for(int i : set)
        {
            if(!set.contains(i-1))// starting element hai 
            {
               int x =  i ; 
               int cnt = 1 ; 
               while(set.contains(x+1))
               {
                cnt += 1 ; 
                x +=1 ; 

               }
                longest  = Math.max(cnt,longest) ;

            }
           
        }
        return longest ; 
    }
}