import java.util.HashMap;

public class twosumExists {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=10;
        
    }
    public String twoSumExists(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate over all elements
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return "YES";  // Pair found
            }
            // Store current element and its index
            map.put(arr[i], i);
        }
        // No pair found
        return "NO";
    }
    public int[] twoSumIndices(int[] arr,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // If complement found, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store current element and index
            map.put(arr[i], i);
        }
        // No pair found
        return new int[] { -1, -1 };
    }
}
