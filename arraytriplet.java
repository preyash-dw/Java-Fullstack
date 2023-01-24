import java.util.*;
public class arraytriplet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        func(a);
    }
    static void func(int arr[]){
        int count=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i<(n-1)){
                if(arr[i]==arr[i+1]){
                    count++;
                    if(count==3){
                        break;
                    }
                }
                else{
                    count=1;
                }
            }
        }
        if(count==3){
        System.out.println("false");}
        else{
            System.out.println("true");
        }
    }
}