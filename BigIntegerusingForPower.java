import java.math.BigInteger;
import java.util.*;
public class BigIntegerusingForPower {
    static BigInteger Powerofnum(BigInteger a,int b)
    {
        BigInteger result,finalResult;
        if(b==1)
        {
            return a;
        }
        else
        {
            result=Powerofnum(a, b/2);
            finalResult=result.multiply(result);
            if(b%2==0)
            {
                return finalResult;
            }
            return a.multiply(finalResult);
        }
        
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        BigInteger a=scn.nextBigInteger();
        System.out.println("enter the power");
        int b=scn.nextInt();
        BigInteger res=Powerofnum(a,b);
        System.out.println("power of num:"+ res);
    }
}
