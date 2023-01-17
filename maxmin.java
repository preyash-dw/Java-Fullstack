public class maxmin{
    public static void main(String arg[]){
        int a[]={9,3,5,6,7,8};
        max(a);
        min(a);
        sum(a);
    }
    static void max(int ar[]){
        int max=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>ar[max]){
                max=i;
            }
        }
        System.out.println(ar[max]+" " );
    }
    static void min(int ar[]){
        int min=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<ar[min]){
                min=i;
            }
        }
        System.out.println(ar[min]+" " );
    }
    static void sum(int ar[]){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        System.out.println("sum of array "+sum);
    }

}