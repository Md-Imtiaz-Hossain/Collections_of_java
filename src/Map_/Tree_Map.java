package Map_;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(105, "Apple");
        hashMap.put(308, "Ball");
        hashMap.put(180, "Cat");
        hashMap.put(1230, "Dog");
        hashMap.put(10, "Egg");
        hashMap.put(5, "Full");
        hashMap.put(10, "Full");
        hashMap.put(30, "Ball");
        hashMap.put(33, null);



        Set<Integer> keys = hashMap.keySet();
        System.out.println("Hash Map- ");
        for (Integer i : keys) {
            System.out.println("Id- "+i + ", Value- " + hashMap.get(i));
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        Set<Integer> keys2 = hashMap.keySet();
        System.out.println("Tree Map- ");
        for (Integer i : keys2) {
            System.out.println("Id- "+i + ", Value- " + treeMap.get(i));
        }

    }
}
