import java.util.ArrayList;
import java.util.List;

public class subsequenceWithSum {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();

        findsubsequneces(0, arr, new ArrayList<>(), result,0);

        System.out.println("all subse:");

        for(List<Integer> sub:result){
            System.out.println(sub);
        }
    }
    public  static void findsubsequneces(int index,int[] arr,List<Integer> current,List<List<Integer>> result,int sum){
        if(s==sum){
            System.out.println(arr);
            return ;
        }

        current.add(arr[index]);
        findsubsequneces(index+1, arr, current, result,s);
        
        current.remove(current.size()-1);

        findsubsequneces(index+1, arr, current, result);
    
    }

}
