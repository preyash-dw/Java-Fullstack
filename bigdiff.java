import java.util.*;
public class bigdiff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        func(a);
    }
    static void func(int arr[]){
        Arrays.sort(arr);
        System.out.println("difference between largest and shortest element is :"+arr[arr.length-1]-arr[0]);
    }
}