package Lesson_03;
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
    //    ArrayList list = new ArrayList();
       list.add(2809);
       list.add(1);
       list.add(54);
       list.add(6);
       list.add(9);
       list.add(9);
       list.add(7);

       for (Object o : list) {
           System.out.print(o + " ");
        }
       System.out.println();
       System.out.println(list.size());
       list.sort(null);

       for (Object o : list) {
        System.out.print(o + " ");
    }
   }
}
