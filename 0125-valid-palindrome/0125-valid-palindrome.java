class Solution {
    public boolean isPalindrome(String s) {
       int start  = 0 ; 
       int len = s.length()-1 ;  
       int end =  len  ; 
       while(start<=end)
       {
        while(start<end && !Character.isLetterOrDigit(s.charAt(start)))
        {
            start++ ;
        }
         while(start<end && !Character.isLetterOrDigit(s.charAt(end)))
        {
            end-- ;
        }
        if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end)))
        {
            return false; 
        }
        start++;
        end--;
       }
       return true ; 
    }
}