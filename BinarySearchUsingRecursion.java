import java.util.Scanner;
public class BinarySearchUsingRecursion {
    static int BinarySearch(int arr[],int start,int end,int key)
    {
        int mid=start+(start+end)/2;
        while(start<end)
        {
        if(key==mid)
        {
            return mid;
        }
        else if(key>mid)
        {
            return BinarySearch(arr,mid-1,end,key);
        }  
        else 
        {
            return BinarySearch(arr,mid+1,end,key);
        }
    }
    return -1;
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
        int key;
        System.out.println("enter the element that you want to search:");
        key=scn.nextInt();
        num=BinarySearch(arr,0,arr.length-1,key);
        System.out.println(num);
    }   
}
