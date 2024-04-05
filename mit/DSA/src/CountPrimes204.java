import java.util.Arrays;

public class CountPrimes204 {
    public static int countPrimes(int n) {
        if(n<2)
        {
            return 0;
        }
        boolean arr[] =new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            for(int j=2*i;j<=n;j=j+i)
            {
                arr[j]=false;
            }
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==true)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
