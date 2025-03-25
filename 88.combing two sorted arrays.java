class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int i=nums1.length-1;
        int p2=n-1;

        //starting to fill the largest element from nums1 and nums2 from the last element of nums1    
        while(i>=0 && p2>=0 && p1>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[i]=nums2[p2];
                p2--;
            }
            
            else if(nums1[p1]>=nums2[p2]){
                nums1[i]=nums1[p1];
                p1--;
            }
            i--;
        }

        //copying remaining element in second array nums2
        while(p2>=0){
            nums1[i]=nums2[p2];
            p2--;
            i--;
        }
        
    }
}