import java.util.*;
public class array4 {
    public static void main(String[] args) {
        //int[][]  arr=new int[3][3];
        //int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(arr[1][0]);
        
        int[][] arr=new int [3][4];
        System.out.println(arr.length);
        
        //for taking input of array
        Scanner in=new Scanner(System.in);
        System.out.println("enter array ele:");
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                arr[row][col]=in.nextInt();
                
            }

        }//output: fot printing array
        for(int row=0; row<arr[row].length;row++){
            for(int col=0; col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
    
        }
    }
}
