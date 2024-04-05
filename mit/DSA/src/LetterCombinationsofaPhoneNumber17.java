import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {
    public static List<String> list=new ArrayList<String>();
    public static void partition(String ans,String digit)
    {
        if(digit.isEmpty())
        {
            list.add(ans);
            return;
        }
        int temp=digit.charAt(0)-'0';
        int n=0;
        if(temp<8)
        {
            n=97+(temp-2)*3;
        }
        else if(temp==8)
        {
            n=97+(19);
        }
        else
        {
            n=97+19+3;
        }
        int iterator=0;
        if(temp==7||temp==9)
        {
            iterator=4;
        }
        else
        {
            iterator=3;
        };
        for(int i=0;i<iterator;i++)
        {
            partition(ans+((char)(n+i)),digit.substring(1));
        }
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
        {
            return new ArrayList<String>();
        }
        partition("",digits);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
