public class arrayleft{
    public static void main(String args[]){
        int a[]={3,4,5,6,7,8};
        left(a);
    }
    static void left(int ar[]){
        int l=ar[0];
        for(int i=0;i<ar.length;i++){
            if(i==ar.length-1){
                ar[i]=l;
            }
            else{
                ar[i]=ar[i+1];
            }
        }
        System.out.println("Array after left shift");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}