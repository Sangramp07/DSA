package MATRIX;

public class kthSmallestt {
    public int kthSmallest(int[][] mat, int k) {
        // code here
        int n=mat.length;
        int low=mat[0][0];
        int high=mat[n-1][n-1];//find low and high elem
        while (low<=high) {
            int mid=low+(high-low)/2;
            int count=countlessEqual(mat, n, mid);
            if(count<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }return low;
    }
    private int countlessEqual(int[][] mat,int n,int target   ){
        int row=n-1;
        int col=0;
        int count=0;
        while (row>=0 && col<n) {
                if(mat[row][col]<=target){
                    count+=(row+1);
                    col++;
                }
                else{
                    row--;
                }   
        }return count;
    }
}
