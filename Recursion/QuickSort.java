public class QuickSort {
    public static int Getpivot(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while (i<j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (arr[j]>pivot && j>=low) {
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        // Place the pivot in its correct sorted position
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return  j;
        // Return the partition index
    }

    public  static void QuickSortt(int[] arr,int low,int high){
        if(low<high){
            int PIndex=Getpivot(arr, low, high);

            QuickSortt(arr, low, PIndex - 1);
            QuickSortt(arr, PIndex + 1, high);
        }
    }
}
