import java.util.Arrays;

public class LetterTilePossibilities1079 {
    public static int func(String ps, String ups)
    {
        if(ups.isEmpty())
        {
            return 1;
        }
        int count  = 1;
        for(int i = 0; i < ups.length(); i++)
        {
            if(i+1 < ups.length() && ups.charAt(i) == ups.charAt(i+1))
            {
                continue;
            }
            count = count + func(ps+ups.charAt(i),ups.substring(0,i)+ups.substring(i+1));
        }
        return count;
    }
    public static void main(String[] args) {
        char[] tempArray = "b".toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
//        return new String(tempArray);
        System.out.println(func("",new String(tempArray)));
    }
}
