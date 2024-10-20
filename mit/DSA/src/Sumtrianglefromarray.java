import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Sumtrianglefromarray {
    public static void func(int[] arr)
    {
        int n = arr.length;
        int[] num = new int[((n+1)*n/2)];
        for(int i = 0; i < arr.length; i++)
        {
            num[i] = arr[i];
        }
        int j = 0;
        int jump = arr.length;
        int temp = arr.length-1;
        for(int i = arr.length ; i < num.length ; i++)
        {
            num[i] = num[j] + num[j+1];
            j++;
            jump--;
            if(jump -1 ==0)
            {
                j++;
                jump = temp--;
            }

        }
        int point = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int k = 0; k < i+1; k++)
            {
                System.out.print(num[num.length-1-point++]+" ");
            }
            System.out.println();
        }
            System.out.println(Arrays.toString(num));
    }
    public static void rec(int[] arr)
    {
        if(arr.length == 1)
        {
            return;
        }
        int[] temp = new int[arr.length-1];
        helper(arr,temp,0);
        rec(temp);
        System.out.println(Arrays.toString(temp));

    }
    public static int[] helper(int[] arr, int[] temp, int index)
    {
        if(index == arr.length-1)
        {
            return temp;
        }
        temp[index] = arr[index] + arr[index+1];
        return helper(arr,temp,index+1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int[] arr =new int[5];
        for(int i =0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
//        func(arr);
        rec(arr);
        System.out.println(Arrays.toString(arr));
    }
}
