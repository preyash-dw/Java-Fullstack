import java.util.*;
public class lotteryticket{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        func(a,b,c);

    }
    static void func(int a,int b,int c){
       int count=0;
       if(a==b&&a==c&&b==c){
        count=2;
       }
       else if(a==b||a==c||b==c){
        count=1;
       }

       if(count==2){
        System.out.println("20");
       }
       else if(count==1){
        System.out.println("10");
       }
       else{
        System.out.println("0");
       }
    }
}