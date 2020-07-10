/*-----------------------Priority_Queue---------------
        Indexed: No
        Null Value: no
        Duplicate:  yes
        Ordered: No
        */


package Queue__;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Implimentation_is_Priority_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.offer(3);
        q.offer(2);
        //q.offer(null);
        q.offer(320);
        q.offer(300);
        q.offer(321);
        q.offer(321);

        System.out.println("Main queue size is- "+q.size()+" and the unsorted queue is-  "+q);

        q.poll();
        System.out.println(q);

        q.poll();
        System.out.println(q);

        q.poll();
        System.out.println(q);

        q.offer(2);
        System.out.println(q);

        q.offer(20);
        System.out.println(q);



    }
}
