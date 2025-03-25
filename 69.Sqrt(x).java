class Solution {
    public int mySqrt(int x) {
        int lo=1;
        int hi=x; //this can be x/2
        int ans=0;
        while(lo<=hi){
            int mid=lo+((hi-lo)/2);
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                ans=mid;
                lo=mid+1;
            }
            else if(mid>x/mid){
                hi=mid-1;
            }
        }
        return ans;
        
    }
}