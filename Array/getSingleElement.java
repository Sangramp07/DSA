public class getSingleElement {

    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        System.out.println(getSingleElement(arr));
    }
    static int getSingleElement(int[] arr){
        int xorr=0;
        for(int i=0;i<arr.length;i++){
            xorr=xorr^arr[i];
        }
        return  xorr;
    }
}