import java.util.*;
public class chocolate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many big chocloate");
        int n=sc.nextInt();
        System.out.println("How many small chocolate");
        int n2=sc.nextInt();
        System.out.println("And what your goal");
        int n3=sc.nextInt();
        func(5*n,1*n2,n3);
    }
    static void func(int big,int small,int goal){
        goal-=big;
        if(small==goal){
            System.out.println(small);
        }
        else if(goal<small&&goal>0){
            small-=goal;
            System.out.println(small);
        }
        else if(goal==0){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}