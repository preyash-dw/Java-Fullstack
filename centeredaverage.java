import java.util.*;
public class centeredaverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        func(a);
    }
    static void func(int arr[]){
        Arrays.sort(arr);
        int count=arr.length-2,sum=0;
        for(int i=1;i<arr.length-1;i++){
            int temp=0;
            for(int j=i+1;j<arr.length-1;j++){
                
                if(arr[i]==arr[j]){
                    temp++;
                    count--;
                }
            }
            if(temp==0){
            sum+=arr[i];}
        }
        double result=sum/count;
        System.out.println("result is :"+result);
    }
}