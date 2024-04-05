public class ReshapetheMatrix556 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
        {
            return mat;
        }
        else if(r==mat.length&&c==mat[0].length)
        {
            return mat;
        }
        int[][] ans=new int[r][c];
        int x=0;
        int y=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(y==c)
                {
                    y=0;
                    x++;
                }
                ans[x][y]=mat[i][j];
                y++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        matrixReshape(new int[][]{{1,2},{3,4}},1,4);
    }
}
