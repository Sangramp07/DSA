public class uniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return Countpaths(m - 1, n - 1, dp);
    }

    public int Countpaths(int row, int col, int[][] dp) {
        if (row == 0 || col == 0) {
            return 1;
        }
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        dp[row][col] = Countpaths(row - 1, col, dp) + Countpaths(row, col - 1, dp);
        return dp[row][col];

    }
}
