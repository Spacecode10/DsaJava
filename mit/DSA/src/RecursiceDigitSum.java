public class RecursiceDigitSum {
    public static int func(String n)
    {
        if(n.length() == 1)
        {
            return Integer.parseInt(n);
        }
        int sum = 0;
        for(int i = 0; i < n.length(); i++)
        {
            sum = sum + n.charAt(i)-'0';
        }
        return func(""+sum);

    }
    public static int superDigit(String n, int k) {
        // Write your code here
        String str = "";
        int num = Integer.parseInt(n) * k;
        // System.out.println(str);
        return func(str+num);
    }

    public static void main(String[] args) {
        System.out.println(superDigit("148",3));
    }
}
