import java.util.*;
public class evenlyspaced{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        func(a,b,c);

    }
    static void func(int a,int b,int c){
       int arr[]={a,b,c};
       Arrays.sort(arr);
       if((arr[1]-arr[0])%2==0&&(arr[2]-arr[1])%2==0){
        if((arr[1]-arr[0])==(arr[2]-arr[1])){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
       }
       else{
        System.out.println("false");
       }
    }
}