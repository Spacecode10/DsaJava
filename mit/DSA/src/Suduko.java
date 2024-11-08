import java.lang.reflect.Array;
import java.util.Arrays;

public class Suduko {
    private static boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == c) return false; //check row
            if(board[row][i] != '.' && board[row][i] == c) return false; //check column
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }

    public static void func(char[][] board,int x,int y)
    {
        if(x == board.length)
        { for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));

        }
            System.out.println("\n");
            return;
        }
        if(y == board[0].length)
        {
            func(board,x+1,0);
            return;
        }
        if(!(board[x][y] == '.'))
        {
            func(board,x,y+1);
            return;
        }
        for(int i = 1; i <= 9; i++)
        {
            if(isValid(board,x,y,(char)(i+'0')))
            {
                board[x][y] = (char)(i+'0');
                if(y == board[0].length-1)
                {
                    func(board,x+1,0);
                }
                func(board,x,y+1);
                board[x][y] ='.';
            }
        }
    }
    public static void main(String[] args) {
        char[][] arr = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
//        func(0,0,arr);
        func(arr,0,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
