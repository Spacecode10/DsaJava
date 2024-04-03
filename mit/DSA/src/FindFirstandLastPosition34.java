import java.util.Arrays;

public class FindFirstandLastPosition34 {
    public static int[] searchRange(int[] a, int target) {
        int l=0;
        int r=a.length-1;
        int m=-1;
        int sol1=-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(a[m]==target)
            {
                sol1=m;
                r=m-1;
            }
            else if(a[m]>target)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        l=0;
        r=a.length-1;
        m=-1;
        int sol2=-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(a[m]==target)
            {
                sol2=m;
                l=m+1;
            }
            else if(a[m]>target)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return new int[]{sol1,sol2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10},8)));
    }
}
