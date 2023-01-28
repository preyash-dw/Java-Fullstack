import java.util.*;
public class stac{ 
    public static void main(String arg[]){
        Stack s=new Stack(5);
        System.out.println(s);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.getlength());
        s.pop();
         System.out.println(s.getlength());
         s.clear();
         s.push(30);
         System.out.println(s.getlength());
         s.display();
    }
}
 class Stack{
    private int arr[];
    private int len;
    private int maxlen;
    Stack(int n){
        this.maxlen=n;
        arr=new int[maxlen];
        this.len=0;
    }
    int getlength(){
        return len;
    }
    void push(int e){
        if(this.len<this.maxlen){
        this.arr[this.len]=e;
        this.len++;}
        else{
            System.out.println("Stackoverflow");
        }
    }
    void pop(){
        int temp;
        if(this.len>=0){
        temp=this.arr[this.len-1];
        System.out.println(temp);
        this.len--;}
        else{
            System.out.println("Stack is empty");
        }
    }
    void clear(){
        for(int i=this.len-1;i>=0;i--){
            this.arr[i]=0;
            this.len--;
        }
    }
    void display(){
        for(int i=0;i<this.len;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}