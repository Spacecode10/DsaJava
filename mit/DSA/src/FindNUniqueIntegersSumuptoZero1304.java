import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero1304 {
    public static int[] sumZero(int n) {
        int ans[]=new int[n];
        int temp=-(n/2);
        for(int i=0;i<n;i++)
        {
            if(temp==0&&n%2==0)
            {
                temp++;
                i--;
                continue;
            }
            ans[i]=temp++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString((sumZero(5))));
    }
}
