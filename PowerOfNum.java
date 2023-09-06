import java.util.*;
public class PowerOfNum {
    static int power(int num,int pow)
    {
        int pown;
        if(pow==1)
        {
            return num;
        }
        else
        {
            pown=num*power(num,pow-1);
        }
        return pown;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=scn.nextInt();
        System.out.print("enter the power:");
        int pow=scn.nextInt();
        int res=power(num,pow);
        System.out.print("num^pow=:"+res);
    }
    
}
