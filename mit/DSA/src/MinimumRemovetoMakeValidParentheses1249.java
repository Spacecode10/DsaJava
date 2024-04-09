import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses1249 {
    public static String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder(s);
        Stack<Integer> sta=new Stack<Integer>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                sta.push(i);
            }
            if(str.charAt(i)==')')
            {
                if(sta.empty())
                {
                    str.deleteCharAt(i);
                    i--;
                }
                else
                {
                    sta.pop();
                }
            }
        }
        if(sta.empty())
        {
            return str.toString();
        }
        while(!sta.empty())
        {
            int index=sta.pop();
            str.deleteCharAt(index);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}
