import java.util.ArrayList;
import java.util.Scanner;

public class DivisibleSubset {
    public static boolean fla = false;
    public static void func(ArrayList<Integer> ps, ArrayList<Integer> ups, ArrayList<Integer> arr) {
        if (ups.isEmpty()) {
            long sum = 0;
            for (int i = 0; i < ps.size(); i++) {
                sum = sum + ps.get(i);
            }
            if(sum == 0)
            {
                return;
            }
            if (sum % arr.size() == 0) {
                fla = true;
                System.out.println(ps.size());
                for (int i = 0; i < ps.size(); i++) {
                    System.out.print(arr.indexOf(ps.get(i))+1+" ");
                }
            }
            return;
        }
        ps.add(ups.getFirst());
        ups.removeFirst(); // Safely remove first element by value
        func(new ArrayList<>(ps), new ArrayList<>(ups), arr); // Exclude current element
        ps.removeLast();
        if (fla) return;

        func(new ArrayList<>(ps), new ArrayList<>(ups), arr);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            func(new ArrayList<>(), (ArrayList<Integer>) arr.clone(), arr);
//            System.out.println("\n");

        }
    }
}
