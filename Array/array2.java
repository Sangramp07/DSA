import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 4 string elemnts to array:");
        String[] str=new String[3];
        for(int i=0;i<str.length; i++){
            str[i]=in.next();
        }
        for(int i=0; i<str.length;i++){
            System.out.print(Arrays.toString(str));
        }
        
    }
    
}
