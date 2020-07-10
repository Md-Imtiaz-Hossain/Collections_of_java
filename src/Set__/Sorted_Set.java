/*-----------------------Tree_Set---------------
        Indexed: No
        Null Value: Yes
        Duplicate:  No
        Ordered: yes
        */

package Set__;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set {
    public static void main(String[] args) {


        // SortedSet<Integer> hashSet = new SortedSet<>();
        // Not Possible:
        // SortedSet is abstract Method, cannot be instantiate
        // can be instantiate it's implementation class like - TreeSet


        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(91);
        treeSet.add(40);
        treeSet.add(4);
        treeSet.add(3);
        System.out.println("Sorted Tree Set - "+treeSet);
    }
}
