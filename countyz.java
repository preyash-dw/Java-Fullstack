import java.util.*;
public class countyz{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        func(str);
    }
    static void func(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                 if(str.charAt(i)=='y'||str.charAt(i)=='z'){
                    count++;
                }
            }
            else if(str.charAt(i)==' '){
                if(str.charAt(i-1)=='y'||str.charAt(i-1)=='z'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}