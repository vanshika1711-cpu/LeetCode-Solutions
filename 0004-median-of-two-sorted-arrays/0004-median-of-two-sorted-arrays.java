class Solution {
    public double findMedianSortedArrays(int[]nums1, int[] nums2) {
        // arr1  = 1 ,2  
        // arr2  = 3 , 4 
        int len1  = nums1.length  ; 
        int len2 = nums2.length  ; 
        int nums3[] = new int[len1+len2] ; 
        int len3 = nums3.length  ; 

        // pointers 
        int i  = 0 ; // for nums1
        int j  = 0 ; // for nums2 
        int k = 0 ; // for nums3

        // loops to compare 
        while(i<len1 && j<len2)
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
                 k++ ; 
            }
        }
        // if i or j is left or either one of the array is finished
        while(i < len1)
        {
            nums3[k] = nums1[i] ; 
            i++; 
            k++ ; 
        }
         while(j < len2)
        {
            nums3[k] = nums2[j] ; 
            j++; 
            k++ ; 
        }
        // finding out the median 
        // checking the condition 
        if (len3%2==0)
        {
            return (nums3[len3/2]+nums3[len3/2 -1])/2.0 ; 
        }
        else 
        {
            return (nums3[len3/2]) ; 
        }

    }
}