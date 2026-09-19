package BSonANS;

import java.util.Arrays;

public class largestSubarraySumMinimized {
    public int countPartitions(int[] nums, int maxsum) {
        
        int partitions = 1; // at least one partition
        long subarraySum = 0; // sum of current subarray

        for(int num:nums){
            if(subarraySum+num<=maxsum){
                subarraySum+=num;
            }
            else{
                partitions++;
                subarraySum=num;
            }
        }
        return partitions;
    }
        // Finds the minimum largest subarray sum possible for at most k partitions
    public int splitArray(int[] nums, int k) {
         int low = Arrays.stream(nums).max().getAsInt(); // largest element
        int high = Arrays.stream(nums).sum(); // sum of all elements
        while (low<=high) {
            int mid=(low+high)/2;
            int partitions=countPartitions(nums, mid);
            if(partitions>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return low;
    }
}
