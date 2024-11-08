public class maxminRec {
    public static void min(int[] arr,int min,int index)
    {
        if(index == arr.length)
        {
            System.out.println("min is "+ min);
            return;
        }
        if(min > arr[index])
        {
            min(arr,arr[index],index+1);
        }
        else
        {
            min(arr,min,index+1);
        }
    }
    public static void max(int[] arr,int max,int index)
    {
        if(index == arr.length)
        {
            System.out.println("min is "+ max);
            return;
        }
        if(max < arr[index])
        {
            max(arr,arr[index],index+1);
        }
        else
        {
            max(arr,max,index+1);
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        min(arr,Integer.MAX_VALUE,0);
        max(arr,Integer.MIN_VALUE,0);
    }
}
