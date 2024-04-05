import java.util.*;

public class Nqueen51 {
    public static char[][] arr;
    public static List<List<String>> listOfLists = new ArrayList<>();
    public static void fill(int n)
    {
        arr=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(arr[i],'.');
        }

    }
    public static boolean isSafe(int x,int y)
    {
        int i=x,j=y;
        while(i>=0&&j>=0)
        {
            if(arr[i][j]=='Q')
            {
                return false;
            }
            i--;
        }
        i=x;
        j=y;
        while(i>=0&&j>=0)
        {
            if(arr[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i=x;
        j=y;
        while(i>=0&&j<arr.length)
        {
            if(arr[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void Nqueen(int x,int y)
    {
        if(x==arr.length)
        {
            List<String> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                String temp="";
                for(int j=0;j<arr.length;j++)
                {
                    temp=temp+arr[i][j];
                }
                list.add(temp);
            }
            listOfLists.add(list);
            return;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(isSafe(x,j))
            {
                arr[x][j]='Q';
                Nqueen(x+1,0);
                arr[x][j]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        fill(n);
        Nqueen(0,0);
        return listOfLists;
    }

    public static void main(String[] args) {
        solveNQueens(4);
    }
}
