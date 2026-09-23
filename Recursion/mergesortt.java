public class mergesortt {
    public static  void mergesort(int[] arr ,int low ,int high){

        if(low>=high) return;

        int mid=low+(high-low)/2;
        // Recursively sort the left half
        mergesort(arr, low, mid);
        // Recursively sort the right half
        mergesort(arr, mid+1, high);

        // Merge the two sorted halves together

        merge(arr,low,mid,high);
    }
    private static  void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left]; // Fix 3: Use bracket index assignment
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++; // Move temp pointer forward
        }
         while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
