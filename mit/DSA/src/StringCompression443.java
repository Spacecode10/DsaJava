import java.util.Arrays;

public class StringCompression443 {
    public static int compress(char[] chars) {
        StringBuilder s=new StringBuilder();
        //Arrays.sort(chars);
        int count=1;
        if(chars.length==1)
        {
            s.append(chars[0]);
        }
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                count++;
                if(i==chars.length-2)
                {
                    s.append(chars[i]);
                    s.append(count);
                }
            }
            else
            {

                s.append(chars[i]);
                if(count>1)
                {
                    s.append(count);
                }
                if(i+1==chars.length-1)
                {
                    s.append(chars[i+1]);
                }
                count=1;
            }
        }
        Arrays.fill(chars,'0');
        s.getChars(0,s.length(),chars,0);
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}
