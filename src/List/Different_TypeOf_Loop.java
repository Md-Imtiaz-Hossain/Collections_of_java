package List;

import java.util.ArrayList;

public class Different_TypeOf_Loop {
    public static void main(String[] args) {

        System.out.println("\t\t\t**************Different type of loop in one Parameter Type list**************** \n");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Cat");
        list.add("Dog");
        list.add("Egg");
        System.out.println("Print ArrayList with normally -     \n\t\t\t\t" +list);
        System.out.println("============================================================");
        System.out.println("Print ArrayList with  for loop");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("\t\t\t\t"+(i+1)+"- "+list.get(i));
        }
        System.out.println("============================================================");
        System.out.println("Print ArrayList with  for enhanced Loop");

        for(String enhancedLoop: list ){
            System.out.println("\t\t\t\t"+enhancedLoop);
        }




        System.out.println("\n\n\t\t\t**********Different type of loop in all Parameter Type list****************** \n");
        ArrayList list2 = new ArrayList();
        list2.add("Ass");
        list2.add(8);
        list2.add("Ball");
        list2.add(true);
        list2.add(5.9);
        System.out.println("Print ArrayList with normally -     " +list2);
        System.out.println("============================================================");
        System.out.println("Print ArrayList with  for loop");
        for (int i = 0; i < list2.size() ; i++) {
            System.out.println("\t\t\t\t"+(i+1)+"- "+list2.get(i));
        }
        System.out.println("============================================================");
        System.out.println("Print ArrayList with  for enhanced Loop");

        for(Object enhancedLoop: list2 ){
            System.out.println("\t\t\t\t"+enhancedLoop);
        }




    }
}
