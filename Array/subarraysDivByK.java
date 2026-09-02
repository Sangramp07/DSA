import java.util.HashMap;
import java.util.HashSet;

public class subarraysDivByK {
    public int subarraysDivByK(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        int  count=0;
        int prefixsum=0;

        for(int num:nums){
            prefixsum+=num;
            int remainder=prefixsum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder,0)+1);

        }
        return count;
    }
}
