import java.util.HashMap;

public class subarraySum {
    public static void main(String[] args) {
        

    }
    static int subarraySum(int[] arr, int k){
        int n=arr.length;

        HashMap<Integer,Integer> prefixSumCount=new HashMap<>();
        int prefixSum=0;
        int count=0;

        prefixSumCount.put(0,1);

        for(int i=0;i<n;i++){
            prefixSum+=arr[i];

    // Calculate the prefix sum that needs to be removed
            int remove=prefixSum-k;

         // If this prefix sum has been seen before,
            // add its count to the result
            if(prefixSumCount.containsKey(remove)){
                count+=prefixSumCount.get(remove);
            }
              // Update the frequency of the current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0)+1);
        }
    return count;
    }
}
