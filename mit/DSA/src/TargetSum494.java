public class TargetSum494 {
    public static int func(int[] nums,int target,int sum,int index)
    {
        int x = 0;
        if(index == nums.length && sum == target)
        {
            return 1;
        }
        else if(index == nums.length)
        {
            return 0;
        }
        x = func(nums,target,sum+nums[index],index+1)+func(nums,target,sum-nums[index],index+1);
        return x;

    }
    public static void main(String[] args) {
        int[] nums = {1};

        System.out.println(func(nums,1,0,0));
    }
}
