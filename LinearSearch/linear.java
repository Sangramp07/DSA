public class linear{


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,2,23,34,53,56,5,56,56,4,3,2,41};
        int target=41;
        int ans=linearsearch(arr, target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }return -1;
    }


}