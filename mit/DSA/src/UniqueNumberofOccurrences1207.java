import java.util.ArrayList;
import java.util.Arrays;

public class UniqueNumberofOccurrences1207 {
    public static void main(String[] args) {

            int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
            boolean ans=true;
            Arrays.sort(arr);
            int count=1;
            ArrayList<Integer> arr1 = new ArrayList<Integer>(0);
            for(int i=0;i<arr.length;i=i+count)
            {
                count=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
                arr1.add(count);
            }
            for(int i=0;i<arr1.size();i++)
            {
                for(int j=i+1;j<arr1.size();j++)
                {
                    if(arr1.get(i)==arr1.get(j))
                    {
                        ans=false;
                    }

                }
            }
        System.out.println(ans);
    }
}
