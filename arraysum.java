import java.util.*;
public class arraysum{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three values ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        func(a,b,c);
    }
    static void func(int a,int b,int c){
        int sum=a+b+c;
        if(a==b&&a==c){
            sum=0;
        }
        else if(a==b||a==c){
            sum-=2*a;
        }
        else if(b==c||b==a){
            sum-=2*b;
        }
        else if(c==a||c==b){
            sum-=2*c;
        }
        System.out.println("sum is : "+sum);
    }
}