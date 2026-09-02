class Solution {
    public int pivotIndex(int[] arr) {
        int len = arr.length ; 
        int left[] = new int[len] ; 
        int right[] = new int[len] ; 
        int sum = 0 ; 
        int sum1 = 0 ; 
        for(int i  = 0; i < len ; i++)
        {
        left[i]  =  sum ; 
        sum=sum+arr[i];  
        }
        for(int i = len - 1 ; i>= 0 ;  i--)
        {
        right[i] = sum1 ; 
        sum1 = sum1 + arr[i] ;
        }
       for (int k = 0 ; k <  len ; k++){
        if(left[k]==right[k]){
            return k ; 
        }
       }
       return -1 ;

    }
}

    
