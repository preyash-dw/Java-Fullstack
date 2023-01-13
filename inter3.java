interface X{
    public void run(int a, int b);
    public void swim(int c,int d);
    public void eat(int e,int f);
}
interface Y{
    public void sleep(int g,int h);
}
interface Z{
    public void wake(int i,int j);
}
interface A extends X,Y,Z{
    public void re(int k);
}
class inter3 implements A{
    public void run(int a, int b){
        int result=a+b;
        re(result);
    }
    public void swim(int c, int d){
        int result=c-d;
        re(result);
    }
    public void eat(int e, int f){
        int result=e*f;
        re(result);
    }
    public void sleep(int g, int h){
        int result=g/h;
        re(result);
    }
    public void wake(int i, int j){
        int result=i%j;
        re(result);
    }
    public void re(int k){
        System.out.println(k);
    }
    public static void main(String a[]){
        inter3 on=new inter3();
        on.run(1,2);
    }
}