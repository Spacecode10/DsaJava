public class WordSearch79 {
    public static boolean func(char[][] board,String word,int r, int c,String s,boolean[][] arr)
    {
        boolean var = false;
        if(word.isEmpty())
        {
            return true;
        }
        if(board[r][c] == word.charAt(0))
        {
            arr[r][c] = true;
            if(r + 1 < arr.length && !arr[r+1][c])
            {
                var = func(board,word.substring(1),r+1,c,s+word.charAt(0),arr);
                return var;
            }
            if(c+1 < arr.length && !arr[r][c+1])
            {
                var = func(board,word.substring(1),r,c+1,s+word.charAt(0),arr);
                return var;
            }
            if(r-1 >=0 && !arr[r-1][c])
            {
                var = func(board,word.substring(1),r-1,c,s+word.charAt(0),arr);
                return var;
            }
            if(c-1 >=0 && !arr[r][c-1])
            {
                var = func(board,word.substring(1),r,c-1,s+word.charAt(0),arr);
                return var;
            }
//            var = func(board,word.substring(1),r+1,c,s+word.charAt(0),arr);
            arr[r][c] = false;
        }
        return var;

    }
    public static void main(String[] args) {
       char[][] arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(func(arr,"ABCCED",0,0,"",new boolean[arr.length][arr[0].length]));
    }
}
