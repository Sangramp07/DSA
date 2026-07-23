public class binaryS1 {
    public static void main(String[] args) {
        int[] arr={20,18,17,15,14,12,9,6,4,2,1};
        int target=6;
        int ans=descordSearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    //return -1 if does not exit
    static int descordSearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
    

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            //find midle elemnet
            // int mid=(start+end)/2 it can gives float
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (isAsc) { // ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
        }return -1;
    }
}
