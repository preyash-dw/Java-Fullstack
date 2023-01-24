public class connection4{
    public static void main(String arg[]){
        int a[]={2};
        func(a);
    }
    static void func(int arr[]){
        if(arr.length==2){
            if(arr[0]==arr[1]&&(arr[0]==2||arr[0]==3)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
    }
}