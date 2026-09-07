class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      // normal extra space approach 
      int len  = m +  n ; 
      int nums3[] = new int[len] ; 
      int i  = 0 ; 
      int j = 0  ;
      int k = 0 ; 
      while(i<m && j <n )
      {
        if(nums1[i]<=nums2[j])
        {
            nums3[k] = nums1[i] ; 
            k++;
            i++ ;
        }
        else 
        {
            nums3[k] = nums2[j] ; 
            k++; 
            j++ ;
        }
      }
      // remaning ones 
      while(i<m)
      {
        nums3[k] = nums1[i] ; 
        k++; 
        i++ ;
      }
       while(j<n)
      {
        nums3[k] = nums2[j] ; 
        k++; 
        j++ ;
      }
      // return all ans to nums 1
      for(int x  = 0  ; x < len  ; x++)
      {
        nums1[x] = nums3[x];
      }
    }
}