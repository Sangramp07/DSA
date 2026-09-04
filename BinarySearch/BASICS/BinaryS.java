package BASICS;
public class BinaryS {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,8,9};
        int target=8;
        int ans=binarysearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if does not exit
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find midle elemnet
            // int mid=(start+end)/2 it can gives float
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }else{ 
                return mid;
            }
        }
        return -1;
    }
}
