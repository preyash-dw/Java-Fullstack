public class tri2{
    public static void main(String args[]){
        try{
            int a[]=new int[3];
             a[4]=5;
        }
        catch(ArithmeticException e){
            System.out.println("Invalid");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Out of Bound .....");
        }
        finally{
            System.out.println("End");
        }
    }
}