import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int loop = 1 << 3;
         System.out.print(loop);
//        int gray = ;
        for(int i = 0; i < loop; i++)
        {
            i = i ^ (i >> 1);
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
