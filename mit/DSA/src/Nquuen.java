import java.lang.reflect.Array;
import java.util.ArrayList;

public class Nquuen {
    static ArrayList<ArrayList<String>> Olist = new ArrayList<>();
    public static boolean isValid(int r, int c, char[][] arr)
    {
        for(int i =0; i < r; i++)
        {
            if(arr[i][c] == 'Q')
            {
                return false;
            }
        }
        int j = c;
        int i = r;
        while(i>=0 && j >= 0)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i = r;
        j = c;
        while(i>=0 && j < arr.length)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void func(char[][] arr, int r, int c)
    {
        if(r == arr.length)
        {
            ArrayList<String> temp = new ArrayList<>();
            for(int i = 0; i < arr.length; i++)
            {
                String str = "";
                for (int j = 0; j < arr[0].length; j++)
                {
                    str = str + arr[i][j];
                }
                temp.add(str);
            }
            Olist.add(temp);
        }

        for(int i = c; i < arr.length; i++)
        {
            if(isValid(r,i,arr))
            {
                arr[r][i] = 'Q';
                func(arr,r+1,c);
                arr[r][i] = '.';
            }
            if(i == arr.length -1)
            {
                return;
            }
        }

        // func(arr,r+1,c);
    }public static boolean isValid1(int r, int c, boolean[][] arr)
    {
        int i = r;
        while(i>=0)
        {
            if(arr[i][c])
            {
                return false;
            }
            i--;
        }
        i = r;
        int j = c;
        while(i>=0 && j>=0)
        {
            if(arr[i][j])
            {
                return false;
            }
            i--;
            j--;
        }
        i = r;
        j = c;
        while(i>=0 && j < arr.length)
        {
            if(arr[i][j])
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static int func1(int r,int c,boolean[][] arr)
    {
        if(r == arr.length)
        {
            return 1;
        }
        int x = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(isValid1(r,i,arr))
            {
                arr[r][i] = true;
                x = x+func1(r+1,c,arr);
                arr[r][i] = false;
//                return x;
            }

        }
        return x;

    }
    public static void main(String[] args) {
        char[][] arr = {{'.','.','.','.'},{'.','.','.','.'},{'.','.','.','.'},{'.','.','.','.'}};
//        func(arr,0,0);
        boolean[][] arr1 = new boolean[5][5];
//        func1(0,0,arr1);
        System.out.println(func1(0,0,arr1));
    }
}
