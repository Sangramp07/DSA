public class MissingNum {
    public static void main(String[] args) {
       int[] arr={1,2,3,4};
       System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        long n=arr.length+1;
        long exp=n*(n+1)/2;
        long act=0;
        for(int temp:arr){
            act+=temp;
        }
        return (int)(exp-act);
    }
}
