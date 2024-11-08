import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    static ArrayList<ArrayList<String>> list = new ArrayList<>();
    public static boolean isPal(String str)
    {
        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) == str.charAt(str.length()-1-i))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        if(S.isEmpty())
        {
            return list;
        }
        ArrayList<String> temp = new ArrayList<>();
        if(isPal(S))
        {
            temp.add(S);
        }
        for(int i = 0; i < S.length(); i++)
        {
            String str = S.substring(0,i);
            String str2 = S.substring(i);
            if(isPal(str) && !str.isEmpty())
            {
                temp.add(str);
            }
            else if(isPal(str2))
            {
                temp.add(str2);
            }
            System.out.println(str);
            System.out.println(str2);

        }
        if(!temp.isEmpty())
        {
            list.add(temp);
        }
        return allPalindromicPerms(S.substring(1));

    }
    static boolean isPali(String s)
    {
        for(int  i =0; i < s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
            {
                return false;
            }

        }
        return true;
    }
    static void func(String ps,ArrayList<ArrayList<String>> list)
    {
        if(ps.isEmpty())
        {
            // func(ps+ups.charAt(0),ups.substring(1));
            return;
        }
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 1; i < ps.length()+1; i++)
        {
            if(isPali(ps.substring(0,i)))
            {
                temp.add(ps.substring(0,i));
            }
        }
        list.add(temp);
        func(ps.substring(1),list);

    }
    public static void main(String[] args) {
        String str = "madam";
//        System.out.println(allPalindromicPerms(str));
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        func("madam",list);
        System.out.println(list);
    }

}