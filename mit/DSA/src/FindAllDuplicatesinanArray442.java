import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray442 {
    public static void main(String[] args) {
        int i=0;
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> t=new ArrayList<Integer>();
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]&&nums[i] != nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
//            System.out.print(nums[j]);
            if((j+1)!=nums[j])
            {
                t.add(nums[j]);
            }
        }
        System.out.println(t);
    }
}
