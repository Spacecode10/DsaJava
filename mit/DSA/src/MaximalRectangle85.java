import java.util.Arrays;

public class MaximalRectangle85 {
    public static int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length&&j!=i;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i+" "+j);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));

    }
}
