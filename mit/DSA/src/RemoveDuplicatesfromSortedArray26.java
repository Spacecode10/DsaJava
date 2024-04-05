public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        int unique=1;
        int[] temp =new int[nums.length];
        int j=1;
        temp[0]=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                temp[j]=nums[i+1];
                j++;
                unique++;
            }
        }
        for(int i=0;i<unique;i++)
        {
            nums[i]=temp[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}
