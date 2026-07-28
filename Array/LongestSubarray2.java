public class LongestSubarray2 {
    public static void main(String[] args) {
        
    }
    static int LongestSubarray(int[] nums,int k){
        int left=0;
        int right=0;
        int maxLength=0;
        int sum=nums[0];

        while(right<nums.length){
            while(left<=right && sum>k){
                sum-=nums[left];
                left++;
            }
            if(sum==nums.length){
                maxLength=Math.max(maxLength, right-left+1);
            }
            right++;
            if(right<nums.length){
                sum+=nums[right];
            }
        }
        return maxLength;
    }
}
