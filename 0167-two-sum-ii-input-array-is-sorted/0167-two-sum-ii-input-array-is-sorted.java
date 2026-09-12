class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int len = numbers.length ; 
    int left  =   0 ; 
    int right  = len-1  ; 
    for(int i =  0 ;  i<len  ; i++)
    {
        if(numbers[left]+numbers[right]>target)
        {
            right-- ; 
        }
        else if (numbers[left]+numbers[right]<target)
        {
            left++ ;
        }
        else 
        {
            return new int[]{left+1,right+1} ;
        }
    }
    return new int[]{} ;
    }
}