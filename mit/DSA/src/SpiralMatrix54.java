import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        // System.out.println(row+" "+col);
        boolean x_counter=true;
        boolean y_counter=false;
        int x=0;
        int y=-1;
        int counter=0;
        int size=0;
        int x_pos=0,x_neg=0,y_neg=0;
        int y_pos=0;
        int k=0;

        ArrayList<Integer> arr1 = new ArrayList<Integer>(row*col);

        while(counter<row+col-1)
        {
            while(x_counter&&(k+x_pos<col)&&size<row*col&&y<col-1)
            {
                y++;
                arr1.add(matrix[x][y]);
                size++;
                k++;
            }
            k=0;
            x_pos=x_pos+2;
            x_counter=!x_counter;
            counter++;
            while(!y_counter&&k+y_neg+1<row&&size<row*col&&x<row-1)
            {
                x++;
                arr1.add(matrix[x][y]);
                size++;
                k++;

            }
            y_neg+=2;
            y_counter=!y_counter;
            counter++;
            k=col;
            while(!x_counter&&k>x_neg+1&&size<row*col&&y>0)
            {
                y--;
                arr1.add(matrix[x][y]);
                size++;
                k--;

            }
            x_neg+=2;
            x_counter=!x_counter;
            counter++;
            k=row;
            while(y_counter&&x>1&&size<row*col&&k>y_pos+2)
            {
                x--;
                arr1.add(matrix[x][y]);
                size++;
                k--;

            }
            y_pos+=2;
            y_counter=!y_counter;
            counter++;
            k=0;
            if(size==(row*col))
            {
                break;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
