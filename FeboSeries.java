import java.util.*;
public class FeboSeries {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the range");
        int range=scn.nextInt();
        int prev=0;
        int pres=1;
        System.out.print(prev+" "+pres);
        int next;
        for(int i=0;i<range;i++)
        {
            next=pres+prev;
            System.out.print(" "+next);
            prev=pres;
            pres=next;
        }
    }
}
