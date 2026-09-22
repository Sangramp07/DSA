import java.util.Arrays;

public class revArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        revesearray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void revesearray(int[] arr,int start,int end){
        if(start>=end) return ;

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        revesearray(arr, start+1, end-1);
    }

}
