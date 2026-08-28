class Solution {
    public int[] twoSum(int[] nums, int target) {
     
     // brute force approach 
    //  int len  = nums.length ; 
    //  for(int i  = 0 ; i < len-1  ; i++)
    //  {
    //     for(int j = i+1 ; j < len ; j++)

    //     {
    //       if(nums[i]+nums[j]==target)
    //       {
    //         return new int[]{i,j} ; 
    //       }
    //     }
    //  }
    //  return new int []{} ; 
    


    // optimised approach - using hashmaps 
    int len = nums.length ; 
    HashMap<Integer,Integer>map  = new HashMap<>(); 
    for(int i = 0 ; i < len ; i++)
    {
        if(map.containsKey(target-nums[i]))
        {
            return new int[]{i,map.get(target-nums[i])} ;
        }
        else 
        {
            map.put(nums[i], i) ;
        }
    }
    return new int[]{} ; 
    }
}