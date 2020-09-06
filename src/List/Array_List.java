package List;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

    System.out.println("\n\t\t\tWork with Array List with String Parameter");
    ArrayList<String> list = new ArrayList<>(); // Same as- List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Cat");
        list.add("Dog");
        list.add("Egg");
    System.out.println("--> ArrayList -" +list);
    list.remove("Ball");
    System.out.println("--> Removing- Ball , updating list is  -" +list);
    boolean b =  list.contains("abb");
    System.out.println("--> abb is in the list- " +b);
    System.out.println("--> Size of  the list- " +list.size());



    System.out.println("\n\n\t\t\tWork with Array List with No Parameter");
    ArrayList list1 = new ArrayList();
    list1.add("Ass");
    list1.add(8);
    list1.add("Ball");
    list1.add(true);
    list1.add(5.9);
    System.out.println("--> Array list is -> "+list1);
    System.out.println("--> Find the index of value-8 in the arraylist -> "+list1.indexOf(8));
    list1.add(2,3333);
    System.out.println("--> Adding 3333 with index 2 -> "+list1);
    list1.set(5,"OverrideValue");
    System.out.println("--> Overriding the value with index(5) -> "+list1);
    }

}
