public class FindPivotIndex724 {
    public static int pivotIndex(int[] arr) {
        int j=arr.length-1;
        int sum_f=0;
        int sum_r=0;
        int[] sumFr=new int[arr.length];
        int[] sumRe=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {

            sum_f=sum_f+arr[i];
            sum_r=sum_r+arr[j];
            sumFr[i]=sum_f;
            sumRe[j]=sum_r;
            j--;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(sumFr[i]==sumRe[i])
            {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}
