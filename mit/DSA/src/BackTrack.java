public class BackTrack {
    public static int shortestWay(int r,int c,int des)
    {
        if(r*3 + c + 1 == des)
        {
            return 0;
        }
        if(r < 2)
        {
            return 1 + noWay(r+1,c,des);
        }
        else
        {
            return 1 + noWay(r,c+1,des);
        }
    }
    public static int noWay(int r,int c,int des)
    {
        if(r == 2 || c ==2)
        {
            return 1;
        }
        return noWay(r+1,c,des)+noWay(r,c+1,des);
    }
    public static void posiWay(String ans,int r,int c)
    {
        if(r == 2 && c ==2)
        {
            System.out.println(ans);
            return ;
        }
        if(r < 2)
        {
//            System.out.print("d");
            posiWay(ans+"d",r+1,c);
        }
        if(c < 2)
        {
//            System.out.print("r");
            posiWay(ans+"r",r,c+1);
        }
//        return noWay(r+1,c,des)+noWay(r,c+1,des);

    }
    public static void blockWay(String ans,int r,int c)
    {
        if(r == 2 && c ==2)
        {
            System.out.println(ans);
            return ;
        }
        if(r == 1 && c == 1)
        {
            return;
        }
        if(r < 2)
        {
//            System.out.print("d");
            blockWay(ans+"d",r+1,c);
        }
        if(c < 2)
        {
//            System.out.print("r");
            blockWay(ans+"r",r,c+1);
        }
//        return noWay(r+1,c,des)+noWay(r,c+1,des);

    }
    public static void main(String[] args) {
//        System.out.println(noWay(0,0,9));
//        posiWay("",0,0);
        blockWay("",0,0);
    }
}
