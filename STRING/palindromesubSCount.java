package STRING;

public class palindromesubSCount {
    

    public int countSubstring(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            count+=expand(s, i, i);
            count+=expand(s, i, i+1);
        }
        return count;
    }
    private int expand(String  s,int left,int right){
        int count=0;
        //checking palindrome
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            count ++;
            left--;
            right++;
            
        }return count;
    }
}
