import java.util.HashSet;

public class removedupli {
    public static void main(String[] args) {
        int[] nums={0,1,1,1,2,2,3,3,3};

        // int ans=removeDuplicates(nums)
    }
    public int removeDuplicates(int[] nums){
         // HashSet to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();

        // Position to overwrite next unique element
        int index = 0;

        // Loop over each number in nums
        for (int num : nums) {
            // If num is not in the set, it is unique
            if (!seen.contains(num)) {
                // Add num to the set
                seen.add(num);

                // Write num at current index position
                nums[index] = num;

                // Move index forward
                index++;
            }
        }
        // Return number of unique elements
        return index;
    }

}

// int i=0;
        // if (nums.length == 0) return 0;

// for(int j=1; j<n;j++){
//     if(arr[i]!=arr[j]){
//         arr[i+1]=arr[j];
//         i++;
//     }
// }
// return i+1;