import java.util.*;
public class fourinput{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("enter 1 for true, 2 for false");
        int s=sc.nextInt();
        func(a,b,c,s);

    }
    static void func(int a,int b,int c,int s){
        int count=0;
        if(s==1){
            if(a<b){
                count++;
                if(b<c){
                    count++;
                }
                else{
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        else if(s==2){
            if(a==b||a<b){
                count++;
                if(b==c||b<c){
                    count++;
                }
                else{
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        else{
            System.out.println("Invalid Output");
        }
        if(count==2){
            System.out.println("TRue");
        }
        else{
            System.out.println("false");
        }
    }
}