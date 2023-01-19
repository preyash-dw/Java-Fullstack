import java.util.*;
public class concatlist{
    public static void main(String args[]){

         List<Integer> list1 = new ArrayList<Integer>(); 
        list1.add(1); 
        list1.add(2); 
        list1.add(3); 
        list1.add(4); 

         List<Integer> list2 = new ArrayList<Integer>(); 
        list2.add(1); 
        list2.add(2); 
        list2.add(3); 
        list2.add(4); 

        List<Integer> concatenated_list = new ArrayList<Integer>(); 
         concatenated_list.addAll(list1); 
        concatenated_list.addAll(list2); 
        System.out.println(concatenated_list);
    }
}