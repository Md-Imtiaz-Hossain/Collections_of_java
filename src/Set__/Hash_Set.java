/*-----------------------Hash_Set---------------
        Indexed: No
        Null Value: Yes
        Duplicate:  No
        Ordered of inserting value: No
        */


package Set__;

import java.util.*;

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


        Set<String> hashSet1;
        Set<String> hashSet2;



        hashSet1 = new HashSet<>(Arrays.asList("a","b","c"));
        hashSet2 = new HashSet<>(Arrays.asList("b","c","d"));
        // Union
        hashSet1.addAll(hashSet2);
        System.out.println("Union of (a,b,c) & (d,b,c) -> " + hashSet1);


        hashSet1 = new HashSet<>(Arrays.asList("a","b","c"));
        hashSet2 = new HashSet<>(Arrays.asList("b","c","d"));
        // Intersection
        hashSet1.retainAll(hashSet2);
        System.out.println("Intersection of (a,b,c) & (d,b,c) -> " + hashSet1);


        hashSet1 = new HashSet<>(Arrays.asList("a","b","c"));
        hashSet2 = new HashSet<>(Arrays.asList("b","c","d"));
        // Difference
        hashSet1.removeAll(hashSet2);
        System.out.println("Difference of (a,b,c) & (d,b,c) -> " + hashSet1);



    }
}
