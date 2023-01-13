
public class practise2{
    public static void main(String args[]){
       int num[]={1,2,1,1,2,3,4,4,5,5};
       fun(num);
    }
    static void fun(int a[]){
        int count=0;
        int prev=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==a[i]){
                    c++;
                }
                else{
                    if(c>count){
                        count=c;
                        prev=a[i];
                    }
                }
            }
        }
        System.out.println(prev);
    }
}
