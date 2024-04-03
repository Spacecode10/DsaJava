public class ValidSuduko36 {
    public static boolean isValidSudoku(char[][] board) {
        //System.out.print(board[0].length);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                for(int k=0;k<9;k++)
                {
                    if(j==k)
                    {
                        continue;
                    }
                    if(board[i][j]==board[i][k]&&board[i][j]!='.')
                    {
                        System.out.print(i+" "+j+" "+k);
                        return false;
                    }
                }
                for(int k=0;k<9;k++)
                {
                    if(i==k)
                    {
                        continue;
                    }
                    else if(board[i][j]==board[k][j]&&board[i][j]!='.')
                    {
                        System.out.print("2");
                        return false;
                    }
                }
                int x=0;
                int y=0;
                if(i<3&&j<3)
                {
                    x=0;
                    y=0;
                }
                else if(i<6&&j<3)
                {
                    x=3;
                    y=0;
                }
                else if(i<9&&j<3)
                {
                    x=6;
                    y=0;
                }
                else if(i<3&&j<6)
                {
                    x=0;
                    y=3;
                }
                else if(i<3&&j<9)
                {
                    x=0;
                    y=6;
                }
                else if(i<6&&j<6)
                {
                    x=3;
                    y=3;
                }
                else if(i<9&&j<6)
                {
                    x=6;
                    y=3;
                }
                else if(i<6&&j<9)
                {
                    x=3;
                    y=6;
                }
                else if(i<9&&j<9)
                {
                    x=6;
                    y=6;
                }

                for(int a=x;a<x+3;a++)
                {
                    for(int b=y;b<y+3;b++)
                    {
                        if(i==a&&j==b)
                        {
                            continue;
                        }
                        else if(board[a][b]==board[i][j]&&board[i][j]!='.')
                        {
                            System.out.print("3");
                            System.out.print(i+" "+j+" "+a+" "+b);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans=isValidSudoku(new char[][]{{'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}});
        System.out.println(ans);
    }

}
