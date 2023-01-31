import java.util.*;
public class sharedigit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=10&&a<=99&&b>=10&&b<=99){
        func(a,b);}
        else{
            System.out.println("Not in range");
        }
        
    }
    static void func(int a,int b){
        int count=0;
        while(a>0){
            int temp=a%10;
            while(b>0){
                int temp1=b%10;
                if(temp1==temp){
                    count++;
                }
                b=b/10;
            }
            a=a/10;
        }
        if(count>0){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}