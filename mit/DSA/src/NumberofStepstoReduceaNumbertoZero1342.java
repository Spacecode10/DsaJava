public class NumberofStepstoReduceaNumbertoZero1342 {
    public static int numberOfSteps(int n) {
        int count=0;
        while(n>0)
        {
            if(n%2==0)
            {
                count++;
                n=n/2;
            }
            else
            {
                count++;
                n--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
