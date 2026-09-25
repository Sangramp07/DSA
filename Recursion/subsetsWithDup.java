import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
                Arrays.sort(nums);
                findsubsequneces(0, nums, null, new ArrayList<>());
                return new ArrayList<>();

    }
    public  static void findsubsequneces(int index,int[] nums,List<Integer> current,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return ;
        }

        current.add(nums[index]);
        findsubsequneces(index+1, nums, current, result);
        
        current.remove(current.size()-1);
        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        findsubsequneces(index+1, nums, current, result);
    
    }
}
