public class PowerFunc {
    public static long power(long x, int y) {
        if(y == 0)
        {
            return 1;
        }
        if(y == 1)
        {
            return x%1_000_000_000L;
        }
        return (x%1_000_000_000L * power(x, y-1))%1_000_000_000L;
    }
    public static void main(String[] args) {
        long power = (power(5, 25)%1_000_000_000L * power(4,25)%1_000_000_000L)%1_000_000_000L;
        System.out.println(power);
    }
}
