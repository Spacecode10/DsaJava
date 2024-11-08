import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    public static void func(List<List<Integer>> list, int target, int limit, ArrayList<Integer> ps,int start)
    {
        if(limit < 0 || target < 0)
        {
            return;
        }
        if(target == 0 && limit == 0)
        {
            list.add(new ArrayList<>(ps));
            return;
        }
        for(int i = start; i < 10; i++)
        {
            ps.add(i);
            func(list,target-i,limit - 1,ps,i+1);
            ps.removeLast();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        func(list,9,3,new ArrayList<>(),1);
        System.out.println(list);
    }
}
