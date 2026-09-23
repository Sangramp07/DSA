import java.util.ArrayList;
import java.util.List;

public class findSubsequencesCount {
    public static void main(String[] args) {
         int[] arr = {1, 2, 3};
        int k = 3; // Target sum

        int totalcount=findsubsequnecescount(0, arr, new ArrayList<>(), 0, k);
        System.out.println(totalcount);
    }
    public  static int findsubsequnecescount(int index,int[] arr,List<Integer> current,int currentSum,int targetSum){
//base condition
        if(index==arr.length){
            if(currentSum==targetSum){
                return 1;
            }
            return 0;
        }
        current.add(arr[index]);
    // Add arr[index] to currentSum and move to the next index
        int pickCount =findsubsequnecescount(index+1, arr, current, currentSum+arr[index], targetSum);

        current.remove(current.size()-1);

 // Keep currentSum the same and move to the next index
        int skipcount=findsubsequnecescount(index+1, arr, current, currentSum, targetSum) ;

    // Return the combined count of both choices

    return pickCount+skipcount;


}
}