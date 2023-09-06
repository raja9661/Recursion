import java.util.*;
public class MaxValueOfArray {

    static int maxNum(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return arr[index];
        }
        int max=maxNum(arr, index+1);
        if(max>arr[index])
        {
           return max;
        }
        else
        {
            return arr[index];
        }
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
        int num=0;
        num=maxNum(arr,0);
        System.out.println(num);
    }
}
