import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solveNQueens {
    private void solveNQueens(int n, List<List<String>> output, char[][] nQueens, int row) {
        if(row==n){
            List<String> solution=new ArrayList<>();
            for(char[] rowArray:nQueens){
                solution.add(new String(rowArray));
            }
            output.add(solution);
            return ;
        }
    // Try placing queen in each column of current row
        for(int col=0;col<n;col++){
            if(isSafePlace(n,nQueens,row,col)){
                //place queen
                nQueens[row][col]='Q';

                solveNQueens(n, output, nQueens, row+1);

                nQueens[row][col]='.';
            }
        }
    
    }
    private  boolean isSafePlace(int n,char[][] nQueens,int row,int col){
     // Check if there's any queen in the same column above current position
            for(int i=0;i<n;i++){
                if(nQueens[i][col]=='Q'){
                    return   false;
                }
            }
        // Check upper-left diagonal for any queen
            for(int i=row-1,j=col-1; i>=0 &&j>=0; i--,j--){
                if(nQueens[i][j]=='Q'){
                    return false;
                }
            }

        // Check upper-right diagonal for any queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }   

        // If no conflicts found, position is safe
        return true;
      
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output=new ArrayList<>();
        char[][] nQueens=new char[n][n];

        //fill board with dots
        for(int i=0;i<n;i++){
            Arrays.fill(nQueens[i], '.');
        }
        solveNQueens(n, output, nQueens, 0);
        return  output;
    }
}
