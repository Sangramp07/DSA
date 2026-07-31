import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrderr(matrix));
    }
    static List<Integer> spiralOrderr(int[][] matrix){
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        List<Integer> spiral=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left; i<=right;i++){
                spiral.add(matrix[top][i]);
            }top++;
            for(int j=top;j<=bottom;j++){
                spiral.add(matrix[j][right]);
            }right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    spiral.add(matrix[bottom][k]);

                }bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    spiral.add((matrix[l][left]));
                }
                left++;
            }
        }
        return spiral;
    }
}
