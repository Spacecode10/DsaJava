public class LongestStrictlyIncreasingStrictlyDecreasingSubarray3105 {
    public static int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int min=1;
        for(int i=0;i<nums.length-1;i++)
        {
            int temp_max=1;
            int temp_min=1;
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    temp_max++;
                }
                else
                {
                    break;
                }
            }
            max= Math.max(temp_max, max);
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp_min++;
                }
                else
                {
                    break;
                }
            }
            min= Math.max(temp_min, min);
        }
        return Math.max(min,max);
    }

    public static void main(String[] args) {
        System.out.println(longestMonotonicSubarray(new int[]{1,4,3,3,2}));
    }
}
