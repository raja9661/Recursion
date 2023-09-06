import java.util.*;
public class SumOfDigit {
    static int SumOftheDigit(int num)
    {
        int rem,digit=0;
        while(num != 0)
        {
        rem=num%10;
        digit += rem;
        num=num/10;
        }
        return digit;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scn.nextInt();
        int result=SumOftheDigit(num);
        System.out.println("sum of digit is:" + result);
    }
}
