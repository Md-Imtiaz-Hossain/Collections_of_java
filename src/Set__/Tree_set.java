/*-----------------------Tree_Set---------------
        Indexed: No
        Null Value: Yes
        Duplicate:  No
        Ordered: yes
        */


package Set__;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
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
