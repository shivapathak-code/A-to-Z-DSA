import java.util.*;
//
//public class KsortedArray {
//    public static void SortKSorted(int arr[] , int k){
//        PriorityQueue<Integer> minpq = new PriorityQueue<>();
//        int n = arr.length;
//
//        for(int i = 0;i<=Math.min(k , n-1);i++)
//        {
//            minpq.add(arr[i]);
//        }
//            int index = 0;
//        for(int i = k+1;i<n;i++) {
//            arr[index++] = minpq.poll();
//            minpq.add(arr[i]);
//        }
//        while(!minpq.isEmpty())
//        {
//            arr[index++] = minpq.poll();
//        }
//    }
//    public static void main(String[] args)
//    {
//
//        int arr[] = {6 ,5 ,3 ,2 ,8 ,10, 9};
//        KsortedArray k = new KsortedArray();
//        k.SortKSorted(arr , 3);
//        for(int i =0 ;i<arr.length;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    public ListNode mergeKSortedLists(List<ListNode> heads) {

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        // Har linked list ka head PQ mein daalo
        for (ListNode head : heads) {
            if (head != null) {
                pq.add(head);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {

            // Sabse chhota node nikalo
            ListNode curr = pq.poll();

            // Answer mein add karo
            tail.next = curr;
            tail = tail.next;

            // Current node ka next PQ mein daalo
            if (curr.next != null) {
                pq.add(curr.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // List 1: 1 → 4 → 7
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);

        // List 2: 2 → 5 → 8
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(8);

        // List 3: 3 → 6 → 9
        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(6);
        l3.next.next = new ListNode(9);

        // Teeno heads ko List mein daalo
        List<ListNode> heads = new ArrayList<>();

        heads.add(l1);
        heads.add(l2);
        heads.add(l3);

        // Merge
        Solution obj = new Solution();

        ListNode result = obj.mergeKSortedLists(heads);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
