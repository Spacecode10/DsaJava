import java.util.ArrayList;

public class TrappingRainWater42 {
    public static int trap(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0) {
                continue;
            }
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = i; j < arr.length; j++) {

                if (arr[j] == 0) {
                    if (!temp.isEmpty()) {
                        temp.add(0);
                    }
                } else if (arr[i] >= arr[j]) {
                    temp.add(arr[j]);
                    if(arr[j]==arr[i]&&arr[j+1]<arr[j]&&i!=j)
                    {
                        i=j-1;
                        break;
                    }

                } else {
                    temp.add(arr[j]);
                    i = j - 1;
                    break;
                }


            }

            System.out.println(temp);
        }
        return 0;
    }

    public static void main(String[] args) {
        trap(new int[]{4,1,2,3,4,0,5});
        trap(new int[]{4,2,0,3,2,5});
        trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});

    }
}



