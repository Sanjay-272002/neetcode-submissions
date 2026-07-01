class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tlen=nums1.length+nums2.length;
        int half=(tlen+1)/2;
        int [] small=nums1.length<nums2.length?nums1:nums2;
        int [] large=nums1.length<nums2.length?nums2:nums1;
        int l=0,r=small.length;
        while(l<=r){
            int mid=(l+r)/2;
            int rem=half-mid;

            int l1= mid>0? small[mid-1]: Integer.MIN_VALUE;
            int r1= mid<small.length? small[mid] : Integer.MAX_VALUE;
            int l2= rem>0?large[rem-1]:Integer.MIN_VALUE;
            int r2= rem<large.length? large[rem]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if(tlen%2==0){
                   return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
                return Math.max(l1, l2);
            }else if(l1>r2){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
    return -1;
    }
}
