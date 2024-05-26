public class NumberOfIslands200 {
    public static int numIslands(char[][] grid) {
    int count=0;
    boolean[][] visited=new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length ; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                boolean island=false;
                if(grid[i][j]=='1')
                {
                    visited[i][j]=true;
                }
                if(i-1>=0&&grid[i-1][j]=='1'&& !visited[i - 1][j])
                {
                    visited[i-1][j]=true;
                }
                if(j-1>=0&&grid[i][j-1]=='1'&& !visited[i][j-1])
                {
                    visited[i][j-1]=true;
                }
                if(i+1<grid.length&&grid[i+1][j]=='1'&& !visited[i + 1][j])
                {
                    visited[i+1][j]=true;
                }
                if(j+1<grid[0].length&&grid[i][j+1]=='1'&& !visited[i][j+1])
                {
                    visited[i][j+1]=true;
                }
                if(i-1>=0&& visited[i - 1][j])
                {
                    if (j - 1 >= 0 && visited[i][j - 1])
                    {
                        if (i + 1 < grid.length && visited[i + 1][j])
                        {
                            if (j + 1 < grid[0].length && visited[i][j + 1])
                            {
                                island=true;
                            }
                        }
                    }
                }
                if(island)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numIslands( new char[][]{{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}}));
    }
}
