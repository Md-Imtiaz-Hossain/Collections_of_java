/*-----------------------Deque---------------
        Indexed: No
        Null Value: no
        Duplicate:  yes
        Ordered: No
        Delete with - FIFO
        */


package Queue__;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class De_Queue {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(5);
        q.add(50);
        q.add(55);
        q.add(5);
        //q.add(null);
        System.out.println(q);

        q.remove();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.add(550);
        System.out.println(q);

    }
}
