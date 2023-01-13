import java.util.Scanner;
public class twoarr{
    public static void main(String args[]){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter row of array");
       int r=sc.nextInt();
       System.out.println("Enter coloumn of array");
       int c=sc.nextInt();

       int array[][]=new int[r][c];
       System.out.println("Enetr array elements");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            array[i][j]=sc.nextInt();
        }
      
       }

       System.out.println("Array elements are :");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){

        System.out.print(array[i][j]+" ");
        }
        System.out.println("");
        
       }


    }
}