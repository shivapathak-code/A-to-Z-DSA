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
// delete the node with equal value X;

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
//    public ListNode deleteNodeWithValueX(ListNode head, int X) {
//        if(head.data == X)
//        {
//            return head.next;
//        }
//        ListNode temp = head;
//        ListNode prev = null;
//        while(temp!=null)
//        {
//            if(temp.data == X)
//            {
//                prev.next = temp.next;
//                temp.next = null;
//            }
//            prev = temp;
//            temp = temp.next;
//        }
//        return head;
//
//    }
//}

// insertion in kth position save all test case ;

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
//    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
//        ListNode newNode = new ListNode(X);
//
//
//        if(head == null && K<=1)
//        {
//            return newNode;
//        }
//        if(head != null && K == 1)
//
//        {
//            newNode.next = head;
//            head = newNode;
//            return head;
//        }
//        ListNode temp = head;
//        ListNode prev = null;
//
//        for(int i = 1;i<=K-1;i++)
//        {
//            prev = temp;
//            // k ki value yahan badi hogi jab tak hame k-1 ban tak loop chalaya to temp sayad null ho jye is bajaya
//            // se hame check kerna padega kahi temp null to nhi hain hain
//            if(temp == null)
//            {
//                return head;
//            }
//            temp = temp.next;
//        }
//        newNode.next = temp;
//        prev.next = newNode;
//        return head;
//
//    }
//}

// /*
//Definition of singly linked list:
//class ListNode{
//    public int data;
//    public ListNode next;
//    ListNode() { data = 0; next = null; }
//    ListNode(int x) { data = x; next = null; }
//    ListNode(int x, ListNode next) { data = x; this.next = next; }
//}
//*/
//
//class Solution {
//    public ListNode insertBeforeX(ListNode head, int X, int val) {
//        ListNode newNode = new ListNode(val);
//        if(head == null)
//        {
//            return newNode;
//        }
//        if(head.data == X)
//        {
//            newNode.next = head;
//            head = newNode;
//            return head;
//        }
//        ListNode temp = head;
//        ListNode prev = null;
//
//        while(temp != null)
//        {
//            if(temp.data == X)
//            {
//                newNode.next = temp;
//                prev.next = newNode;
//                return head;
//            }
//            prev = temp;
//            temp = temp.next;
//
//        }
//        return head;
//    }
//}

// dobly linkedlist convert array to linkedlist;

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

//class Solution {
//    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
//        if(arr == null || arr.isEmpty())
//        {
//            return null;
//        }
//        ListNode head = new ListNode(arr.get(0));
//        ListNode curr = head;
//
//        for(int i = 1;i<arr.size();i++)
//        {
//            ListNode newNode = new ListNode(arr.get(i));
//
//            curr.next = newNode;
//            newNode.prev = curr;
//
//            curr = newNode;
//        }
//        return head;
//    }
//}
// doubly  linkedlist delete the node in tail;

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

//class Solution {
//    public ListNode deleteTail(ListNode head) {
//        if(head.next == null)
//        {
//            return null;
//        }
//        ListNode temp  = head;
//
//        while(temp.next != null)
//        {
//            temp = temp.next;
//        }
//        temp.prev.next = null;
//        temp.prev = null;
//        return head;
//    }
//}
/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

//class Solution {
//    public ListNode deleteKthElement(ListNode head, int k) {
//        if(head == null || k<=0)
//        {
//            return head;
//        }
//        if(k == 1)
//        {
//            ListNode newhead = head.next;
//            if(newhead!=null)
//            {
//                newhead.prev = null;
//            }
//            head.next = null;
//            return newhead;
//        }
//        ListNode temp = head;
//        for(int i = 1;i<=k-1 && temp!=null;i++)
//        {
//            temp = temp.next;
//        }
//        if (temp == null) {
//            return head;
//        }
//        if(temp.prev!=null)
//        {
//            temp.prev.next = temp.next;
//        }
//        if(temp.next != null)
//        {
//            temp.next.prev = temp.prev;
//        }
//        temp.prev = null;
//        temp.next = null;
//
//        return head;
//
//    }
//}
// here iss given a node not given head  so not travel the complete list only check the node
//preform opretation only check condition
// where use head so use node direct number;

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

//class Solution {
//    public void deleteGivenNode(ListNode node) {
//        if (node == null) {
//            return;
//        }
//
//        if (node.prev != null) {
//            node.prev.next = node.next;
//        }
//
//        if (node.next != null) {
//            node.next.prev = node.prev;
//        }
//
//        node.prev = null;
//        node.next = null;
//    }
//}

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/


// connection of doubly linkedlist only four connection first connection left to right and after connect
// second connection of newNode;
//class Solution {
//    public ListNode insertBeforeTail(ListNode head, int X) {
//        ListNode newNode = new ListNode(X);
//        if(head.next == null)
//        {
//            newNode.next = head;
//            head.prev = newNode;
//            return newNode;
//        }
//
//        ListNode temp = head;
//
//        while(temp.next != null)
//        {
//            temp = temp.next;
//        }
//        newNode.prev = temp.prev ;
//        newNode.next = temp;
//        temp.prev.next = newNode;
//        temp.prev =  newNode;
//
//
//
//        return head;
//    }
//}


