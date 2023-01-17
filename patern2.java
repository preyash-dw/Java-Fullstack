public class patern2{
    public static void main(String ar[]){
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            if(j==i){
                for(int k=j;k>=1;k--){
                    System.out.print(k);
                }
            }
            else{
                System.out.print(j);
            }
            }
            System.out.println(" ");
        }
        }
        
    }

