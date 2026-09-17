class Solution {
    public boolean isPalindrome(String s) {
        int len  = s.length() ;  
        int st  = 0  ; 
        int ed  = len-1  ; 
        while(st<=ed)
        {
            while(st<ed && !Character.isLetterOrDigit(s.charAt(st)))
            {
                st++ ;
            }
              while(st<ed && !Character.isLetterOrDigit(s.charAt(ed)))
            {
                ed-- ;
            }
            if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(ed)))
            {
                return false ; 
            }
            st++ ;
            ed-- ;
        }
        return true ; 
    }
}