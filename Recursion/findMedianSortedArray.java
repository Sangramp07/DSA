public class findMedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int total=m+n;
        int curr=0,pre=0;
        int i=0,j=0;

        for(int count=0;count<=total;count++){
            pre=curr;
            if (i<m && j<n) {
                if(nums1[i]<=nums2[j]){
                    curr=nums1[i++];
                }else{
                    curr=nums2[j++];
                }
            }else if(i<m){
                curr=nums2[j++];
            }
        }
        if(total%2==0){
            return  curr;
        }
        else{
            return  (pre+curr)/2.0;
        }
    }
}
