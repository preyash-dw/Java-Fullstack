import java.util.*;
public class makemiddle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        func(ar);
    }
    static void func(int arr[]){
        if(arr.length<=2){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            int mid=arr.length/2;
            for(int i=0;i<arr.length;i++){
                if(i==(mid-1)){
                    System.out.println(arr[i]+" "+arr[i+1]);
                }
            }
        }
    }
}