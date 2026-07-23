public class linearS4 {
    //FIND MINIMUM ELEMENT IN ARRAY
    public static void main(String[] args) {
        int[] arr={12,43,65,1,563};
        System.out.println(min(arr));
    }//assume array is not empty
    static int min(int[] arr){
        int ans=arr[0];//assume [0] as min and compare with others
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
