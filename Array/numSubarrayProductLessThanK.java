

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;

        if(k<=1){
            return 0;
        }
        int left=0;
        int prod=1;
        int count=0;
        for(int right=0;right<n;right++){
            prod*=nums[left];

            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=right-left+1;
            

        }

        return count;
    }
}