import java.util.*;
public class priorityQueue {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        minpq.offer(1);
        minpq.offer(30);
        minpq.offer(0);
        minpq.offer(13);
        minpq.offer(10);
        System.out.println( " priority queue "+ minpq);
        System.out.println(minpq.peek());
        System.out.println(minpq.poll());


        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.add(1);
        maxpq.add(30);
        maxpq.add(10);
        maxpq.add(13);
        maxpq.add(0);
        System.out.println( " priority queue "+maxpq );
        System.out.println(maxpq.peek());
        System.out.println(maxpq.contains(30));
        System.out.println(maxpq.poll());
        System.out.println(maxpq.contains(30));


    }
}
