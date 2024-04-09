import java.util.Stack;

public class ValidParenthesisString678 {
    public static boolean checkValdiString(String s)
    {
//        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                StringBuilder temp=new StringBuilder(s);
                temp.replace(i,i+1,")");
                if (checkValdiString(temp.toString()))
                {
                    return true;
                }
                temp=new StringBuilder(s);
                temp.replace(i,i+1,"");
                if(checkValdiString(temp.toString()))
                {
                    return true;
                }
                temp=new StringBuilder(s);
                temp.replace(i,i+1,"(");
                if(checkValdiString(temp.toString()))
                {
                    return true;
                }
            }
        }
        return checkvalid(s);
//        System.out.println(s);
    }

    private static boolean checkvalid(String s) {
        Stack<Character> sta=new Stack<Character>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='*')
            {
                return false;
            }
            if(s.charAt(i)=='(')
            {
                sta.push('(');
            }
            if(s.charAt(i)==')')
            {
                if(sta.empty())
                {
                    return false;
                }
                else
                {
                    sta.pop();
                }
            }
        }
        return sta.empty();
    }

    public static void main(String[] args) {
        System.out.println(checkValdiString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
//        System.out.println(checkValdiString("(*))"));
    }
}
