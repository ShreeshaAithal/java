import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       List<Integer> list1=new ArrayList<>();
       List<Integer> list2=new ArrayList<>();
       list1.add(1);
       list1.add(3);
       list1.add(2);
       list1.add(2);
       list1.add(4);

       list2.addAll(list1);

       for (int i=0;i<list1.size();i++){
           for(int j=i+1;j<list2.size();j++){
               if(list2.get(i)==list2.get(j)){
                   list2.remove(j);
               }
           }
       }
       System.out.println(list2);
    }
}