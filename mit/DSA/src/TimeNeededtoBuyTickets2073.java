public class TimeNeededtoBuyTickets2073 {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets[k];
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<tickets.length;j++)
            {
                if(tickets[j]>0)
                {
                    tickets[j]--;
                    count++;
                }
            }
        }
        for(int i=0;i<=k;i++)
        {
            if(tickets[i]>0)
            {
                tickets[i]--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{84,49,5,24,70,77,87,8},3));
    }
}
