/*-----------------------Hash_Map---------------
        Indexed(index is ordered): No
        Null Value: only one - Yes
        Duplicate:  50%
        Inserting Duplication Note:-
        if key same + value different -> last value set in previous where the key is same
        if key different + value same -> Both key Stored With Different Value
        Ordered(value is ordered): No
        */


package Map_;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Hash_map {
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

    }

}
