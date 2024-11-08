import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CombinationSum40 {
    public static int sum(List<Integer> list)
    {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }
    public static void func(ArrayList<Integer> ps, ArrayList<Integer> ups, ArrayList<ArrayList<Integer>> list, int target, int start) {
        int sum = sum(ps);
        if (sum == target) {
            if(!list.contains(ps))
            {
                list.add(new ArrayList<>(ps));
            }
            return;
        }
        if (sum > target) {
            return;
        }

        for (int i = start; i < ups.size(); i++) {
            // Skip duplicates
            if (i > start && ups.get(i) == ups.get(i - 1)) {
                continue;
            }

            ps.add(ups.get(i));
            func(ps, ups, list, target, i + 1); // Move to the next index
            ps.removeLast(); // Backtrack
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> ups = new ArrayList<>();
        ups.add(10);
        ups.add(1);
        ups.add(2);
        ups.add(7);
        ups.add(6);
        ups.add(1);
        ups.add(5);

        // Sort the input list to handle duplicates
        Collections.sort(ups);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        func(new ArrayList<>(), ups, list, 8, 0);
        System.out.println(list);
    }
}
