/*-----------------------Linked_Hash_Set---------------
        Indexed: No
        Null Value: only one
        Duplicate:  No
        Ordered: no
        */

package Set__;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linked_Hash_Set {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(null);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(50);
        linkedHashSet.add(3);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);


    }
}
