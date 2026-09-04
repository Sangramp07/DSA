

public class mySqrt {
    public int mySqrt(int x){
        int left=1,right=x/2;

        while(left<=right){
            int mid= left+(right-left)/2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid; // perfect square
            } else if (square < x) {
                // right = mid; // store as possible answer
                left = mid + 1; // look for bigger
            } else {
                right = mid - 1; // look for smaller
            }
        }
        return right;
    
    }
}
