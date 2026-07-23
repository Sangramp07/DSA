import java.util.Arrays;

public class linearS5 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},//0
            {4,5,6},//1
            {7,8,9}//2
        };
        int target =6;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search (int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }return new int[]{-1,-1};
    } 
}
