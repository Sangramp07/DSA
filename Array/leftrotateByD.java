import java.util.Arrays;

class Solution {
    // Rotate the array to the right by k positions
    public void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Store last k elements
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy the stored elements to the front
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // Rotate the array to the left by k positions
    public void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Store first k elements
        int[] temp = Arrays.copyOfRange(arr, 0, k);

        // Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy stored elements to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        sol.rotateRight(arr, k);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        sol.rotateLeft(arr2, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr2));
    }
}
