class removeZeroToEnd {
    static int[] moveZeros(int[] arr){
        int[] temp=new int[arr.length];

        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            // If non-zero, copy to temp

                temp[index]=arr[i];
                index++;
            }
        }
    // Copy temp back to original
    for(int i=0; i<arr.length;i++){
        arr[i]=temp[i];
    }
    return arr;

    }
}
public class  moveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3, 12};
        removeZeroToEnd sol=new removeZeroToEnd();
        int[] result=sol.moveZeros(arr);
        for(int num:result){
            System.out.println(num+" ");
        }
        System.out.println();
        
    }

    
}



//optimal approach
// int j=-1;
// for(int i=0;i<nums.length;i++){
//     if(nums[i]==0){
//         j=i;
//         break;
//     }
// }
// if(j==-1) return ; //no non zero element
// for(int i=j+1;i<nums.length; i++){
//     if(nums[i]!=0){
//         // swap 
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         j++;
//     }
// }
