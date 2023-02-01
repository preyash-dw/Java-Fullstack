import java.util.*;
public class divideself{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num=sc.nextInt();
        func(num);
    }
    static void func(int num){
        int n=num;
        int count=0;
        while(num>0){
            int temp=num%10;
            if(temp!=0){
                if((n/temp)%2==0){
                    count++;
                }
                else{
                    System.out.println("false");
                    break;
                }
            }
            num=num/10;
        }
        if(count>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}