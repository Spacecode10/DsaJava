public class SortAnArray912 {
    public static int partition(int[] arr,int l,int r)
    {
        int i=l;
        int j=r;
        int pi=arr[r];
        while(i<j)
        {
            while(arr[i]<=pi&&i<j)
            {
                i++;
            }
            while(arr[j]>=pi&&j>i)
            {
                j--;
            }
            if(i<j)
            {

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[r];
        arr[r]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static int[] sort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int pi=partition(arr,l,r);
            System.out.println(pi);
            sort(arr,l,pi-1);
            sort(arr,pi+1,r);
        }
        return arr;
    }
    public static int[] sortArray(int[] nums) {
        return sort(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        sortArray(new int[]{5,1,1,2,0,0});
    }
}
