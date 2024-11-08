import java.util.ArrayList;

public class FindtheWinneroftheCircularGame1823 {
        public static int func(int k, int i, ArrayList<Integer> str)
        {
            if(str.size() == 1)
            {
                return str.getFirst();
            }
            if(i+k-1>=str.size())
            {
                int size = str.size();
                str.remove((i+k-1)%str.size());
                return func(k,(i+k-1)%size,str);
            }
            else
            {
                str.remove(i+k-1);
                return func(k,i+k-1,str);
            }
        }
    public static void main(String[] args) {
        ArrayList<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(4);
        str.add(5);
        str.add(6);
        str.add(7);
        str.add(8);
        str.add(9);
        str.add(10);

        System.out.println(func(7,0,str));
    }
}
