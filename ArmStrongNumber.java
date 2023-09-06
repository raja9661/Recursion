import java.util.*;
public class ArmStrongNumber {
    static int isArmStrongNumber(int num)
    {
        int rem,sum=0;
        if(num==0)
        {
            return 0;
        }
        else
        {
            rem=num%10;
            sum = rem*rem*rem;
            return sum+isArmStrongNumber(num/10);
        }
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the three digit number.");
        int num=scn.nextInt();
        int armNum=isArmStrongNumber(num);
        if(num==armNum)
        {
            System.out.println("Yes it is  a ArmStrong Number.");
        }
        else
        {
            System.out.println("it is not a ArmStrong Number:"); 
        }
    }
    
}
