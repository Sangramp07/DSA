import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
  
    public boolean isvalid(String str, int n) {
        int count = 0;

        for(char s : str.toCharArray()) {
            if(s == '(') {
                count++;
            } else {
                count--;
            }

            if(count < 0) {
                return false;
            }
        }
        return (count == 0 ? true : false);
    }

    public void generateParenthesiss(String curr, int n, List<String> res) {
        if(curr.length() == 2*n) {
            if(isvalid(curr, n)) {
                res.add(curr);
            }
            return;
        }

        generateParenthesiss(curr + "(", n, res);
        generateParenthesiss(curr + ")", n, res);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        generateParenthesiss("", n, res);
        return res;
    }

}
