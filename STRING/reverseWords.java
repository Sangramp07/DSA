package STRING;

public class reverseWords {
    public String reverseWords(String s){
       String ans = "";
       int n=s.length();
       String str = "";
       for(int i=0;i<n;i++){
        if(s.charAt(i)==' ' && !str.equals("")){
            ans=str+" "+ans;
            str="";
        }
        else if(s.charAt(i)==' ')
            continue;
        else str+=s.charAt(i);
       } 
       if(!str.equals(""))
        ans=str+" "+ans;
    return ans.trim();
    }
}
