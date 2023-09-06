import java.util.*;
public class SumOfTheValueOfArray {
    static int SumOfArray(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return arr[index];
        }
        return arr[index]+SumOfArray(arr, index+1);
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int index=5;
        int arr[]=new int[index];
        System.out.println("enter the elements of array");
        for(int i=0;i<index;i++)
        {
            arr[i]=scn.nextInt();
        }
        int sum=0;
        sum=SumOfArray(arr,0);
        System.out.println(sum);
    }
}
