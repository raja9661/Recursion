import java.util.*;
class Factorial
{
    double ftrl;
    double fact(double num)
    {
        if(num<1)
        {
            return 1;
        }
        else
        {
          ftrl=num*fact(num-1);
        }
        return ftrl;
    }
    public static void main(String args[])
    {
        Factorial ft=new Factorial();
      Scanner scn=new Scanner(System.in);
      System.out.println("enter the number");
      double num=scn.nextInt();
      double result=ft.fact(num);
      System.out.println(result);
    }
}