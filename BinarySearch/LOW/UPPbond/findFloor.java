package LOW.UPPbond;

public class findFloor {
    public  int findFloor(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<=target){
                left=mid+1;
                ans=mid;
            }
            else{
                right=mid-1;
            }
        }return  ans;
    }
}
