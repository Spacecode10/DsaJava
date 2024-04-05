import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix1380 {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<Integer>();
        System.out.print(min);
        for(int i=0;i<matrix.length;i++)
        {
            int index=0;
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(min>matrix[i][j])
                {
                    min=matrix[i][j];
                    index=j;
                }
            }
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][index]>max)
                {
                    max=matrix[j][index];
                }
            }
            if(max==min)
            {
                ans.add(max);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}});
    }
}
