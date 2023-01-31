import java.util.*;
public class xyzthere{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        func(str);
    }
    static void func(String str){
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='x'){
                if(str.substring(i,i+3).equals("xyz")){
                    if(str.charAt(i-1)=='.'||str.charAt(i+1)=='.'){
                        System.out.println("false");
                    }
                    else{
                        System.out.println("true");
                    }
                }
            }
        }

    }
}