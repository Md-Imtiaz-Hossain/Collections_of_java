package List;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public static void main(String[] args) {

        LinkedList list3 = new LinkedList();
        list3.add("Ass");
        list3.add(8);
        list3.add("Ball");
        list3.add(true);
        list3.add(5.9);
        list3.addFirst("Welcome");
        list3.addLast("Thanks");
        System.out.println("Print ArrayList with  for enhanced Loop");
        for(Object enhancedLoop: list3 ){
            System.out.println("\t\t\t\t"+enhancedLoop);
        }




        List<String> list4 = new LinkedList<>();
        list4.add("Apple");
        list4.add("Ball");
        list4.add("Cat");
        list4.add("Dog");
        list4.add("Egg");
        System.out.println("Print ArrayList with  for enhanced Loop");
        for(String enhancedLoop: list4 ){
            System.out.println("\t\t\t\t"+enhancedLoop);
        }




    }




}
