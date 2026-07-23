import java.util.Arrays;

public class linearS6{
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},//0
            {4,5,6},//1
            {7,8,9}//2
        };
        System.out.println(max(arr));
    }
    static  int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col]>max){
                    max=new element;
                }
            }
        }return max;
    } 
}