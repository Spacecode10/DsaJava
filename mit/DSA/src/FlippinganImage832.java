import java.util.Arrays;

public class FlippinganImage832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length/2;j++)
            {
                int temp=image[i][j];
                image[i][j]=image[i][image[i].length-j-1];
                image[i][image[i].length-j-1]=temp;
            }
            for(int j=0;j<image[i].length;j++)
            {
                image[i][j]=image[i][j]^1;
            }
        }
        System.out.print(Arrays.toString(image[0]));
        return image;
    }

    public static void main(String[] args) {
        flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
    }
}
