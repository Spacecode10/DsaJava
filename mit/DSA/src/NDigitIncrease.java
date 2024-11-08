import java.util.ArrayList;

public class NDigitIncrease {
    public static ArrayList<Integer> func(int n, int index, ArrayList<Integer> list, StringBuilder number)
    {
        if(number.length() == n)
        {
            list.add(Integer.parseInt(number.toString()));
        }
        for(int i = index; i <= 9; i++)
        {
            number.append(i);
            func(n, i+1, list, number);
            number.deleteCharAt(number.length()-1);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        func(1,1,list,number);
        System.out.println(list);
    }
}
