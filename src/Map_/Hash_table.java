package Map_;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Hash_table {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        // Same as Map<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(105, "Apple");
        hashtable.put(308, "Ball");
        hashtable.put(180, "Cat");
        hashtable.put(1230, "Dog");
        hashtable.put(10, "Egg");
        hashtable.put(5, "Full");
        hashtable.put(10, "Full");
        hashtable.put(30, "Ball");


        Set<Integer> keys = hashtable.keySet();
        System.out.println("Hash Table- ");
        for (Integer i : keys) {
            System.out.println("Id- "+i + ", Value- " + hashtable.get(i));
        }

    }
}
