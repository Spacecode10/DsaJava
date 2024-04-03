import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZero283 {
    public static void moveZeroes(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                x++;
            }
            else
            {
                int temp=nums[i];
                nums[i]=0;
                nums[i-x]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
