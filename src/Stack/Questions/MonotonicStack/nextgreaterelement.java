package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class nextgreaterelement {

    public int[] nextGreaterEle(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        int[] ans = new int[n];

        // Initialize with -1
//        for (int i = 0; i < n; i++) {
//            ans[i] = -1;
//        }

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                    list.get(i) > list.get(st.peek())) {

                int previousIndex = st.pop();

                ans[previousIndex] = list.get(i);
            }

            // Store index, not value
            st.push(i);
        }

        return ans;
    }

    // Linked List Node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Main method
    public static void main(String[] args) {

        nextgreaterelement obj = new nextgreaterelement();

        ListNode head = new ListNode(1);
        head.next = new ListNode(7);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next .next.next= new ListNode(5);
        head.next.next.next.next .next.next.next= new ListNode(1);

        int[] result = obj.nextGreaterEle(head);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
