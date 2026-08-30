class Solution {
    public boolean isPalindrome(int x) {
if (x<0){
    return false;
}
int orig = x ; 
int rev = 0 ; 
for( ; x != 0 ; x= x/ 10 ){
rev = rev * 10 + ( x % 10);
}
if (rev==orig){
    return true ; 
}
else {
    return false ; 
}
    }
}
