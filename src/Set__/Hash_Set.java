/*-----------------------Hash_Set---------------
        Indexed: No
        Null Value: Yes
        Duplicate:  No
        Ordered: No
        */


package Set__;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add(91);
        hashSet.add(40);
        hashSet.add(4);
        hashSet.add(3);

        System.out.println("Unsorted Hash Set - "+hashSet);


    }
}
