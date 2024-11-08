import java.util.ArrayList;
import java.util.List;

public class Substring {
    public static String withoutA(String ps,String ups)
    {
        if(ups.isEmpty())
        {
            return ps;
        }
        if(ups.charAt(0) == 'a')
        {
            return withoutA(ps,ups.substring(1));
        }
        else
        {
            return withoutA(ps+ups.charAt(0),ups.substring(1));
        }
    }
    public static String withoutApple(String ps,String ups)
    {
        if(ups.isEmpty())
        {
            return ps;
        }
        if(ups.startsWith("apple"))
        {
            return withoutApple(ps,ups.substring(5));
        }
        else
        {
            return withoutApple(ps+ups.charAt(0),ups.substring(1));
        }
    }
    public static void subseq(String ps, String ups)
    {
        if(ups.isEmpty())
        {
            System.out.println(ps);
            return;
        }
        char ch = ups.charAt(0);
        if(!ps.isEmpty() && ch == ps.charAt(ps.length()-1))
        {
            return;
        }
        subseq(ps+ch,ups.substring(1));
        subseq(ps,ups.substring(1));
    }
    public static void permutation(String ps, String ups)
    {
        if(ups.isEmpty())
        {
            System.out.println(ps);
            return ;
        }
        for(int i = 0; i < ps.length()+1; i++)
        {
            permutation(ps.substring(0,i)+ups.charAt(0)+ps.substring(i),ups.substring(1));
        }
    }
    public static ArrayList<String> dice(String ps,String ups,int sum)
    {

        int psum = 0;
        if(!ps.isEmpty())
        {
            for(int i = 0; i < ps.length(); i++)
            {
                psum= psum + ps.charAt(i)-'0';
            }
        }
        if(psum==sum)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(ps);

            return list;
        }
        if(psum>sum)
        {
            //            list.add(ps);
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < ups.length(); i++)
        {

            list.addAll(dice(ps+ups.charAt(i),ups,sum));
//            return dice(ps+ups.charAt(i),ups,sum);

        }
        return list;
    }
    public static void main(String[] args) {
        String str = "baapple";
//        System.out.println(withoutApple("",str));
//        subseq("","aaab");
//        permutation("","abc");
        System.out.println(dice("","1234567",5));


    }
}
