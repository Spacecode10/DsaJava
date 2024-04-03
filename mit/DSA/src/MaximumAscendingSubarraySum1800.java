public class MaximumAscendingSubarraySum1800 {
    public static void main(String[] args) {
        int[] nums={12,17,15,13,10,11,12};
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] < nums[i+1])
            {
                sum = sum+nums[i];
            }
            else{
                sum =sum+ nums[i];
                maxSum = Math.max(maxSum , sum);
                sum = 0;
            }
        }
        sum =sum+ nums[nums.length-1];
        maxSum = Math.max(sum , maxSum);
        System.out.println(maxSum);
    }
}
