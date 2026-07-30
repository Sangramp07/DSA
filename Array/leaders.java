import java.util.ArrayList;
import java.util.Collections;

import OOP.generics.Arraylist;

public class leaders {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();

        if(nums.length==0){
            return ans;
        }
        int max=nums[nums.length-1];
        ans.add(nums[nums.length-1]);

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max=nums[i];
            }
        }
          /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);
        
        // Return the leaders
        return ans;
    }
}
