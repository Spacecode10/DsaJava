import java.util.ArrayList;

public class CombinationSum39 {
    public static boolean func(int[] arr, int target, int sum, int index, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp)
    {
//        ArrayList<Integer> temp = new ArrayList<>();
        if(sum == target)
        {
            return true;
        }
        if(sum > target)
        {
            return false;
        }
        for(int i = index; i < arr.length; i++)
        {
            if(func(arr,target,sum+arr[i],index,list,temp))
            {
                temp.add(arr[i]);
//                return true;
            }
        }
        list.add(temp);
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        func(arr,7,0,0,list,temp);
        System.out.println(list);
    }
}
