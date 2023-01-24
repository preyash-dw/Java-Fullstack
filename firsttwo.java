import java.util.*;
public class firsttwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1= sc.nextLine();
       
        func(str1);
        
    }
    static void func(String str){
        
        if(str.length()<=2){
            System.out.println(str+str+str);
        }
        else{
            System.out.println(str.substring(0,2)+str+str.substring(0,2));
        }
    }
}