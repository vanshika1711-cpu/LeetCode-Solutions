class Solution {
    public String reverseWords(String s) {
    int len  = s.length()-1; 
    int i  = len ;  
    StringBuilder ans  = new StringBuilder() ;
    while(i>=0)
    {
        while(i>=0 && s.charAt(i)==' ')
        {
            i-- ; 
        }
        if(i<0) // doubt because ...if while condition of >=0
                // exists then why we are taking this case ? 
        {
            break ; 
        }
        int j  =  i ; 
        while(j>=0 && s.charAt(j)!=' ')
        {
            j--  ; 
        }
        if(ans.length()>0)
        {
         ans.append(' ') ;
        }
        ans.append(s.substring(j+1 , i+1)) ;
        i = j -1 ; 
    }
    return ans.toString() ; 
    }
}