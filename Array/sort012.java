public class sort012 {

    public static void main(String[] args) {
        int[] nums={2,0,2,1,0,0,1};
        int[] ans=sort012(nums);
        System.out.println(ans);
    }
    static int[]  sort012(int[] nums){

        int low=0,mid=0,high=nums.length-1;

        while(nums[mid]==0){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;}
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        return  nums;
    }
}