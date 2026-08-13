class Solution {
    public void rotate(int[][] matrix) {
        int m  = matrix.length ; // rows
        int n  = matrix[0].length  ; // column 

        // traverse -> transpose 
        for(int i  = 0 ; i < m  ; i++)
        {
            for(int j  = i+1 ; j < n ; j++)
            {
                int temp = matrix[i][j] ; 
                matrix[i][j]= matrix[j][i] ; 
                matrix[j][i] = temp  ; 

            }
        }
        // reverse 
        for(int i  = 0 ; i < m ; i++)
        {
            int st  = 0 ; 
            int end =  n-1 ; 
            while(st<end)
            {
                int temp  = matrix[i][st];
                matrix[i][st] = matrix[i][end] ;
                matrix[i][end] = temp ;
                st++ ;
                end--;

            }
        }
    }
}