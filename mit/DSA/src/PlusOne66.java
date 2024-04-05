public class PlusOne66 {
    public static int[] plusOne(int[] digits) {
        int vad=0;
        int sum=digits[digits.length-1]+1;
        for(int i=0;i<digits.length;i++)
        {
            if(i==digits.length-1&&digits[i]==9)
            {
                int[] ans=new int[digits.length+1];
                ans[0]=1;
                return ans;
            }
            if(digits[i]==9)
            {
                continue;
            }
            else
            {
                break;
            }
        }
        if(sum<10)
        {
            digits[digits.length-1]=sum;
            return digits;
        }
        else
        {
            vad=1;
            digits[digits.length-1]=0;
            for(int i=digits.length-2;i>=0;i--)
            {
                sum=0;
                sum=digits[i]+vad;
                if(sum<10)
                {
                    digits[i]=sum;
                    break;
                }
                else
                {
                    vad=1;
                    digits[i]=0;
                }
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        plusOne(new int[]{1,2,3});
    }
}
