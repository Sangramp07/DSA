import java.util.ArrayList;
import java.util.List;

public class subsequenceWithSum {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int target = 2;
        List<List<Integer>> result=new ArrayList<>();

                findSubsequences(0, arr, new ArrayList<>(), 0, target);

        System.out.println("all subse:");

        for(List<Integer> sub:result){
            System.out.println(sub);
        }
    }
    public static void findSubsequences(int index, int[] arr, List<Integer> current, int currentSum, int targetSum) {
        // Base Case: When we have traversed the entire array
        if (index == arr.length) {
            // Check if the accumulated sum matches our target sum
            if (currentSum == targetSum) {
                System.out.println(current);
            }
            return;
        }

        // Choice 1: PICK the current element
        current.add(arr[index]);
        // Move to next index and add the element's value to currentSum
        findSubsequences(index + 1, arr, current, currentSum + arr[index], targetSum);
        
        // Backtrack: Remove the last added element before trying the next choice
        current.remove(current.size() - 1);

        // Choice 2: DON'T PICK the current element
        // Move to next index, keeping currentSum the same
        findSubsequences(index + 1, arr, current, currentSum, targetSum);
    }

}
