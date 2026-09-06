package LOW.UPPbond;

public class findCeill {
    public int findCeil(int[] arr, int x) {
        int left=0;
        int right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=x){
            
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return  ans;
    }
}
