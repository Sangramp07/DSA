import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        
    }
    static int longestConsecutive(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        int longest=1;

        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int count=1;;
                int x=it;

                while (st.contains(x+1)) {
                    x=x+1;
                    count=count+1;
                    
                }
                longest=Math.max(longest, count);
            }
        }return longest;
    }
}
