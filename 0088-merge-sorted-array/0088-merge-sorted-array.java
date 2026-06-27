class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[]= new int[m + n] ; 
        int len  = m+n ; 
        int i  = 0 ; // nums1
        int j  = 0 ; // nums2 
        int k  = 0  ; // nums3 
        
        while(i<m   &&  j<n)
        {
          if(nums1[i]<=nums2[j])
          {
            nums3[k] = nums1[i] ; 
            k++; 
            i++; 
          }
          else 
          {
            nums3[k] = nums2[j] ; 
            j++; 
            k++; 
          }
        }
        // remaining elements 
        while(i<m)
        {
            nums3[k]= nums1[i] ; 
            k++; 
            i++; 
        }
        while (j<n)
        {
            nums3[k] = nums2[j] ; 
            j++ ;
            k++ ;
        }
        for(int x = 0; x < len; x++) { nums1[x] = nums3[x]; }
    }
}