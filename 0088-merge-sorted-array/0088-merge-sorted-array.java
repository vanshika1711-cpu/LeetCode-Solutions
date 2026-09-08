class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i =  0  ; 
    int j  =  0;
    int k  = 0  ; 
    int len  = m+  n  ;  
    int nums3[] = new int[len] ; 
    
    while(i<m && j<n)
    {
      if(nums1[i]<nums2[j])
      {
        nums3[k] = nums1[i]  ; 
        i++ ;
        k++;
      }
      else {
        nums3[k] = nums2[j] ; 
        j++ ;
        k++ ;
      }
    }
    while(i<m)
    {
        nums3[k] = nums1[i] ; 
        i++; 
        k++ ;
    }
    while(j<n)
    {
        nums3[k] = nums2[j] ; 
        j++ ;
        k++ ;
    }
    // return in nums1 
    for(int x =0 ; x < len  ;x++ )
    {
        nums1[x] =  nums3[x] ; 

    }
    }
}