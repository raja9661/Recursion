import java.util.*;
public class SumOfDigitRecursion {
    static int SumOfDigit(int num)
    {
        int rem,sum=0;
        if(num==0)
        {
            return 0;
        }
        else
        {
            rem=num%10;
            sum = rem;
            return sum+SumOfDigit(num/10);
        }
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scn.nextInt();
        int res=SumOfDigit(num);
        System.out.println("sum of the number is:" + res);
    }
    
}
