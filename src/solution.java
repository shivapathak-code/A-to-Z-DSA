import java.util.PriorityQueue;
import java.util.*;
public class solution {
    public static void main(String[] args)
    {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(20);
//        pq.add(15);
//        pq.add(26);
//        pq.add(2);
//        pq.add(98);
//        pq.add(6);
//        System.out.println(pq);
        int arr[] = {20 , 15 , 26 , 2 , 98 ,6};
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println( arr[i]);

        }

    }
}
