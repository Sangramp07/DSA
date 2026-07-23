public class linearS3 {
    public static void main(String[] args) {

        int[]  nums={4,5,6,9,8};
        int target=9;
        //int target=45;
        int ans=linearsearch(nums, target,1,4);
        System.out.println(ans);
    }//search in the array: return the index if item found
        //otherwise if item is not found then return -1
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){

            return -1;

        }
    
        for (int index = start; index <=end; index++) {
            //check for element at every index
            int element=arr[index];
            if(element==target){
                  
                return index;
            }
        }
        return -1;
    }

            
    
    
}
