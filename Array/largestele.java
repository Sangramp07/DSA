

class largestele {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int max=findLargestElement(arr, n);

        
    }
    public static  int findLargestElement(int[] arr,int n){
        int max=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }return max;
    }
}