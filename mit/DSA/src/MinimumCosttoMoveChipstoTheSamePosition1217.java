public class MinimumCosttoMoveChipstoTheSamePosition1217 {
    public static int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(odd,even);

    }

    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{1,2,3}));
    }
}
