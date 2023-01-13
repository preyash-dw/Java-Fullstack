interface A{
    public void add(double x,double y);
    public void sub(double x,double y);
}
interface B{
    public void mul(double x,double y);
    public void div(double x,double y);
}
interface calc extends A,B{
    public void res(double z);
}
public class inter2 implements calc{
    public void add(double x,double y){
     double result=x+y;
     res(result);
    }
    public void sub(double x,double y){
     double result=x-y;
     res(result);
    }
    public void mul(double x,double y){
     double result=x*y;
     res(result);
    }
    public void div(double x,double y){
     double result=x/y;
     res(result);
    }
    public void res(double z){
        System.out.println(z);
    } 
    public static void main(String args[]){
        inter2 ob =new inter2();
        ob.add(2,3);
        ob.sub(2,3);
        ob.mul(2,3);
        ob.div(2,3);
    }
}

