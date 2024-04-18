public class IslandPerimeter463 {

    public static int islandPerimeter(int[][] grid) {
        int par=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    int count=4;
                    if(i-1>=0&&grid[i-1][j]==1)
                    {
                        count--;
                    }
                    if(j-1>=0&&grid[i][j-1]==1)
                    {
                        count--;
                    }
                    if(i+1<grid.length&&grid[i+1][j]==1)
                    {
                        count--;
                    }
                    if(j+1<grid[0].length&&grid[i][j+1]==1)
                    {
                        count--;
                    }
                    par=par+count;
                }
            }
        }
        // System.out.println(par);
        return par;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }
}
