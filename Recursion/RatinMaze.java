import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RatinMaze {
    static void solve(int [][]maze , int x , int y , int n , ArrayList<String> finalR , String current, boolean[][] visited){

        //Base Condition
        if(x==n-1 && y==n-1){
            finalR.add(current);
            return;
        }

        if( x < 0 || y<0 || x>=n || y>=n||maze[x][y]==0 ||visited[x][y] == true ){
            return;
        }

        visited[x][y]=true;
        solve(maze,x-1,y,n,finalR,current+"U",visited);     //up
        solve(maze,x+1,y,n,finalR,current+"D",visited);    //down
        solve(maze,x,y-1,n,finalR,current+"L",visited);   //left
        solve(maze,x,y+1,n,finalR,current+"R",visited);  //right

        visited[x][y]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
       ArrayList<String> finalR = new ArrayList<>();
       String currentRes = "";
       int n = maze.length;
       boolean[][] visited = new boolean[n][n];

       for(boolean row[]:visited){
           Arrays.fill(row , false);
       }

       solve(maze,0,0,n,finalR, currentRes , visited);

       Collections.sort(finalR);
       return finalR; 
    }
}
