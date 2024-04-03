public class ComplementBase1009 {
    public static int bitwiseComplement(int n) {

        if(n==0) return 1;
        int sum=0;
        int pow=1;
        while(n!=1)
        {
            int digit=n%2;
            digit = digit==0 ? 1 : 0;
            sum=sum+digit*pow;
            n=n/2;
            pow=pow*2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}
