public class connection5{
    public static void main(String args[]){
        int a=11;
        int b=9;
        func(a,b);
    }
    static void func(int a,int b){
        int sum=a+b;
        if(sum>=10&&sum<=19){
            System.out.println("20");
        }
        else{
            System.out.println(sum);
        }
    }
}