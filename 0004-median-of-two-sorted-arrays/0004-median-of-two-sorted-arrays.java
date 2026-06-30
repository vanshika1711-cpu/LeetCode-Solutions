class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1  = nums1.length ; 
        int len2 = nums2.length ; 
        int nums3[] = new int[len1+len2] ; 
        int len3  = nums3.length ; 
        int i = 0 ; 
        int j  = 0 ; 
        int k  = 0 ; 
        while(i<len1 && j<len2)
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k] = nums1[i] ; 
                i++; 
                k++; 
            }
            else 
            {
                nums3[k] = nums2[j] ; 
                j++; 
                k++;  
            }
        }
        // remain behind
        while(i<len1)
        {
            nums3[k] = nums1[i] ; 
            k++;
            i++; 
        }
        while(j<len2)
        {
            nums3[k] = nums2[j] ; 
            k++;
            j++ ;
        }
        // finding median now 
        if(len3%2==0)
        {
            return (nums3[len3/2]+nums3[len3/2 -1])/2.0; 
        }
        else 
        {
            return (nums3[len3/2]) ; 
        }

    }
}