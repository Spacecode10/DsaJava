public class FindtheIndexoftheFirstOccurrenceinaString28 {
    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        {
            return -1;
        }
        else if(haystack.equals(needle))
        {
            return 0;
        }
        for(int i=0;i<haystack.length();i++)
        {
            if(needle.charAt(0)==haystack.charAt(i))
            {
                if(i+needle.length()>haystack.length())
                {
                    return -1;
                }
                for(int j=0;j<needle.length();j++)
                {
                    if(needle.charAt(j)==haystack.charAt(i+j))
                    {
                        if(j+1==needle.length())
                        {
                            return i;
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
}
