import java.util.HashMap;
import java.util.Map;

public class checkSubarraySum {
    public boolean checkSubarraySumm(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0, -1);
        int prefixsum=0;
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int rem=prefixsum%k;

            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem, 1);
            }
        }
        return false;
    }
}
