//public class linkedlistquestions {
    // flattern a multi level linkedlist;
//    public static void main(String[] args)
//    {
//        // here is a class when we run this code in any other complier then so that is work as function ;
//        node head;
//        if(head == null)
//        {
//            return head;
//        }
//        node p = head;
//
//        while(p!=null)
//        {
//            if(p.child == null)
//            {
//                p = p.next;
//            }
//            else
//            {
//                node temp = p.child;
//                while(temp.next!=null)
//                {
//                    temp = temp.next;
//
//                }
//                temp.next = p.next;
//                if(p.next!=null) {
//                    p.next.prev = temp;
//                }
//                p.next = p.child;
//                p.child.prev = p;
//                p.child = null;
//            }
//        }
//        return head;
//    }
//    public static void main(String[] args)
//    {
//        if(head == null)
//        {
//            return  head;
//        }
//        listnode prev = head;
//        listnode curr = head.next;
//        int i = 1;
//        list<Integer> criticalpoint = new ArrayList<>();
//
//        while(curr != null && curr.next!=null)
//        {
//            if(curr.val > prev.val && curr.val > curr.next.val)
//            {
//                crticalpoint.add(i);
//            }
//            if(curr.val < prev.val && curr.val < curr.next.val)
//            {
//                crticalpoint.add(i);
//            }
//            curr = curr.next;
//            prev = prev.next;
//            i = i+1;
//        }
//        if(criticalpoint.size() < 2)
//        {
//            return new int[]{-1 , -1};
//        }
//        int mindist = Integer.MAX_VALUE;
//        for(int j = 1;j<critical.size();j++)
//        {
//            mindist = Math.min(mindist , criticalpoint.get(j) - criticalpoint.get(j+1));
//        }
//
//        int maxdist = criticalpoint.get(criticalpoint.size()-1) - criticalpoint.get(0);
//        return new int[]{mindist ,maxdist };
//    }



    // created a program that have calculate the double a linked represtation integer
//    public static void main(String[] args)
//    {
//        public int reverse(int head)
//        {
//            node prev = null;
//            node curr = head;
//            node temp = head;
//
//            while(temp!=null)
//            {
//                node forward = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = forward;
//            }
//            return head;
//        }
//    }
//
//    public int doubleoflinkedlist(int head)
//    {
//        head = reverse(head);
//        listnode dummy = new listnode(-1);
//        dummy = curr.next;
//        node temp = head;
//        int carry = 0;
//        while(temp != null)
//        {
//            int value = temp.data;
//            int sum = value+value+carry;
//            int digit = sum%10;
//            curr.next = new listnode(digit);
//            curr = curr.next;
//            carry = sum/10;
//            temp = temp.next;
//        }
//        if(temp == null && carry != 0)
//        {
//            curr.next = new listnode(carry);
//        }
//        dummy = dummy.next;
//        head = reverse(head);
//
//        return head;
//
//    }
//}

// delete the kth node in linkedlist ;

/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

//class Solution {
//    public ListNode deleteKthNode(ListNode head, int k) {
//        if(head == null ||k <= 0)
//        {
//            return head;
//        }
//        if(k == 1)
//        {
//            return head.next;
//        }
//        ListNode temp = head;
//        ListNode prev = null;
//
//        for(int i = 1;i<=k-1;i++)
//        {
//            prev = temp;
//            temp = temp.next;
//            if(temp == null)
//            {
//                return head;
//            }
//
//        }
//        prev.next = temp.next;
//        temp.next = null;
//        return head;
//    }
//}
//delete at the tail in linkedlist
//class Solution {
//    public ListNode deleteTail(ListNode head) {
//        ListNode temp = head;
//        if(head.next == null){
//            return head.next;
//
//        }
//        while(temp.next.next!=null){
//            temp = temp.next;
//
//        }
//        temp.next = null;
//        return head;
//    }
//}
// travsal in likedlist;

/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

//class Solution {
//    public List<Integer> LLTraversal(ListNode head) {
//        ArrayList<Integer>list = new ArrayList<>();
//        ListNode temp = head;
//        while(temp!=null){
//            list.add(temp.data);
//            temp = temp.next;
//        }
//        return list;
//    }
//}
