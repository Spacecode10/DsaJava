public class LengthofLastWord58 {
    public static int lengthOfLastWord(String s) {
        char[] arr=s.toCharArray();
        int count=0;
        boolean first=false;
        for(int i=arr.length-1;i>=0;i--)
        {
            // System.out.println(first);
            if(arr[i]==' '&&!first)
            {
                continue;
            }
            else if(arr[i]!=' ')
            {
                first=true;
                count++;
            }
            if(arr[i]==' '&&first)
            {
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
