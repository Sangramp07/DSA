import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        
    }
    static int majorityElement(int[] nums){
        int n = nums.length;
        
        // Hash map to store element counts
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        /* Iterate through the map to
           find the majority element */
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        
        // Return -1 if no majority element is found
        return -1;
    }
}


public int majority(int[] nums){
    int n=nums.length;
    int count=0;
    int ele=0;
    for(int i=0;i<n;i++){
        if(count==0){
            count=1;
            ele=nums[i];}
            else if(ele==nums[i]){
                count++;
            }
            else{
                count--;
            }
    }

    int count1=0;
    for(int i=0;i<n;i++){
        if(nums[i]==ele){
            count1++;
        }
    }
}