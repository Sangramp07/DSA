public class binaryS4 {
    //smaller letter than given 
    public static void main(String[] args) {
        int[] letter = {'c','f','j'};
        int target = 'j';
        int ans = smallerletter(letter, target);
        System.out.println(ans);
    }

    static int smallerletter(int[] letter, int target) {

        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letter[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            } 
        }
        return letter[start%letter.length];
    }

}
