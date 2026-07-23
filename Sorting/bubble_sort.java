import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={5,8,2,4,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1
        for(int i=0;i<arr.length; i++){
            swapped=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[i];
                    arr[i]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you did not stoped for perticular value for i,menas array is swapped
            if(!swapped){
                break;
            }
        }
    }
}
