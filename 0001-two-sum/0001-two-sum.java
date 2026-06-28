class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        int len  =  nums.length ;  
        HashMap<Integer, Integer>map = new HashMap<>();  
        for(int i = 0  ; i < len  ; i++){
            if(map.containsKey(target-nums[i]))
            {
              return new int[]{i,map.get(target-nums[i])};
            }
            
            else 
            {
                map.put(nums[i],i) ;
            }
        }
        return new int[]{}; 
    }
}