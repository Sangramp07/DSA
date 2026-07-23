import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        int[]  num={1,2,3,4};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] num){//to change the elements of array
        num[0]=99;
    }
}
