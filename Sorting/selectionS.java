import java.util.Arrays;

public class selectionS {
    public static void main(String[] args) {
        int[] arr={5,8,2,4,1,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in remaing arr and swapp with correct
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    
    private static int getMaxIndex(int[] arr, int i, int last) {
        int max = i;
        for (int j = i + 1; j <= last; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
