import java.util.*;
public class array1 {
    public static void main(String[] args) {
        int[] a;
        a=new int[5];
        int[] a4=new int[5];
        a4[0]=10;
        a4[1]=20;
        a4[2]=30;
        a4[3]=40;
        a4[4]=70;
        //System.out.print(a4[3]);

        String[] a2=new String[0];
         String[] a3;
         a3=new String[3];
         System.out.println(a3[0]);

        Scanner in=new Scanner(System.in);
         //input using for lop
        for(int i=0; i<a4.length; i++){
            a4[i]=in.nextInt();
        }
        for(int i=0;i<a4.length;i++){
            System.out.print(a4[i]+" ");
        }
        for(int num:a4){//for pritn every element in arayy
            System.out.print(num+" ");
        }
    }
}
