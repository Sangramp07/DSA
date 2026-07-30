public class nextPermutation {
    public static void main(String[] args) {
        int[] nums={12,3,4,5,7};
    }
    static int[] nextPermutation(int[] nums){
        int index=-1;
    // Find the first decreasing element from end

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,index+1,nums.length-1);
        }
        return nums;
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
