import java.util.*;
public class FeboUsingRcn {
    static int FeboUsingRcn(int i)
    {
        if(i==0 )
        {
            return 0;
        } 
        else if(i==1)
        {
            return 1;
        }
        else
        {
           return FeboUsingRcn(i-1) + FeboUsingRcn(i-2);

        } 
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the range:");
        int range=scn.nextInt();
        int next;
        for(int i=0;i<=range;i++)
        {
            next=FeboUsingRcn(i);
            System.out.print(" "+next);
        }
    }
}
