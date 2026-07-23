import java.util.*;

public class demo {
    public static void main(String[] args) {
        
    
    int[] num={2,3,4,5,6,7,8,9};
    int target=6;
    int ans=linearsearch(num, target);
    System.out.println(ans);

}
    static int linearsearch(int[] num, int target){
        if(num.length==0){
            return -1;
        }
        for(int i=0;i<num.length;i++){
            int element=num[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
