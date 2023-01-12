public class practise{
    public static void main(String args[]){
        int nums[]={1,1,2,2,3,3,3,4,4,1,1};
        func(nums);
    }
    static void func(int a[]){
      
        int count =1;
        for(int i=0;i<a.length;i++){
           if(i==a.length-1){
            System.out.println(count);
           }
           else if(a[i+1]==a[i]){
            count++;
           }
           else{
            System.out.println(count);
           count=1;
           }
        }
       
    }
}