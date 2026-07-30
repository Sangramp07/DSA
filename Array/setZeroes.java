public class setZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][]ans =setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    static int[][] setZeroes(int[][] matrix){

        //get dimensions of matrix
        int m=matrix.length;
        int n=matrix[0].length;

        boolean firstRowZero=false;
        boolean firstColZero=false;

        for (int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRowZero=true;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        //use first row/col as markers
        for(int i=1;i<m;i++){
            for (int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
         // Set cells to zero based on markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        // Zero the first row if needed
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }return matrix;
    }
}
