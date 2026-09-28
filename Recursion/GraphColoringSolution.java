
import  java.util.*;
public class GraphColoringSolution {

    public static boolean graphColoring(List<Integer>[] G, int[] color, int m) {
        int n = G.length;
        return solve(0, G, color, n, m);
    }

    private static boolean isSafe(int node, List<Integer>[] G, int[] color, int col) {
        for (int neighbor : G[node]) {
            if (color[neighbor] == col) {
                return false; 
                        }
        }
        return true;
    }
   private static boolean solve(int node, List<Integer>[] G, int[] color, int n, int m) {
         if (node == n) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m)) {
                    return true;
                }

                color[node] = 0;
            }
        }
        return false; 
    }
}

    
