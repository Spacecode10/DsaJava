public class PowerSum {
    public static int func(int x,int n,int sum,int limit,int index)
    {
        if(sum == x)
        {
            return 1;
        }
        if(sum > x)
        {
            return 0;
        }
        int count = 0;
        for(int i=index;i<=limit;i++)
        {
            sum = sum + (int)Math.pow(i,n);
            count +=func(x, n, sum, limit, i+1);
            sum = sum - (int)Math.pow(i,n);
        }
        return count;
    }
    static double nthRoot(int A, int N)
    {

        // initially guessing a random number between
        // 0 and 9
        double xPre = Math.random() % 10;

        // smaller eps, denotes more accuracy
        double eps = 0.001;

        // initializing difference between two
        // roots by INT_MAX
        double delX = 2147483647;

        // xK denotes current value of x
        double xK = 0.0;

        // loop until we reach desired accuracy
        while (delX > eps)
        {
            // calculating current value from previous
            // value by newton's method
            xK = ((N - 1.0) * xPre +
                    (double)A / Math.pow(xPre, N - 1)) / (double)N;
            delX = Math.abs(xK - xPre);
            xPre = xK;
        }

        return xK;
    }
    public static void main(String[] args) {
        int N = 2;
        int A = 100;

        double nthRootValue = nthRoot(A, N);
//        System.out.println((int)nthRootValue);
        System.out.println(func(100,2,0,(int)nthRootValue,1));
    }
}
