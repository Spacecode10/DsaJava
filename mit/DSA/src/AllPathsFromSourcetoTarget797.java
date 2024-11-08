import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourcetoTarget797 {
    public static int[][] arr;
    public static void func(List<List<Integer>> list, int curr, List<Integer> ps)
    {
        if(curr == arr.length-1)
        {
            list.add(new ArrayList<>(ps));
            return;
        }
        for(int i = 0; i < arr[curr].length; i++)
        {
            ps.add(arr[curr][i]);
            func(list,arr[curr][i],ps);
            ps.removeLast();
        }
    }
    public static void main(String[] args) {
        arr = new int[][]{{1, 2}, {3}, {3}, {}};
//        System.out.println(Arrays.toString(arr[0]));
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ps = new ArrayList<>();
        ps.add(0);
        func(list,0,ps);
        System.out.println(list);
    }
}
