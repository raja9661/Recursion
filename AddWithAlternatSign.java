import java.util.*;
public class AddWithAlternatSign {
    static int addWithsign(int num)
    {
        int altsignsum=0;
        if(num==0)
        {
            return 0;
        }
        else if(num%2==0)
        {
            altsignsum = -num+addWithsign(num-1);
        }
        else 
        {
            altsignsum = num+addWithsign(num-1);
        }
        return altsignsum;
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int num=scn.nextInt();
        int sum=addWithsign(num);
        System.out.println(sum);
    }
}
