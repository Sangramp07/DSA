public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=15;
        System.out.println(LongestSubarray(arr, 0));
    }
    static int LongestSubarray(int[] arr,int k){
        int n = arr.length;
        int maxLength = 0;

        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex; endIndex < n; endIndex++) {

                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    currentSum += arr[i];
                }

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }
}
