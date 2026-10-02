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
// that is insert the node in kth position ;
//class Solution {
//    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
//        ListNode newNode = new ListNode(X);
//        if(head == null && K <= 0)
//        {
//            return newNode;
//        }
//        if(K == 1)
//        {
//            newNode.next = head;
//            head.prev = newNode;
//            return newNode;
//        }
//        ListNode temp = head;
//
//        for(int i = 1;i<=K-1;i++)
//        {
//            temp = temp.next;
//        }
//
//
//        newNode.prev = temp.prev;
//
//        newNode.next = temp;
//
//        temp.prev.next = newNode;
//        temp.prev = newNode;
//        return head;
//    }
//}
//

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
//    public void insertBeforeGivenNode(ListNode node, int X) {
//        ListNode newNode = new ListNode(X);
//        if(node == null)
//        {
//            return;
//        }
//
//
//        newNode.prev = node.prev;
//        newNode.next = node;
//
//
//        node.prev.next = newNode;
//        node.prev = newNode;
//    }
//}


/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head.next == null && n <= 0)
//        {
//            return head;
//        }
//        ListNode temp = head;
//        int count = 0;
//        while(temp != null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        if(count == n)
//        {
//            return head.next;
//        }
//        ListNode curr = head;
//        ListNode prev = null;
//
//        for(int i = 1; i<=count-n;i++)
//        {
//            prev = curr;
//            curr = curr.next;
//        }
//        prev.next = curr.next;
//
//        return head;
//
//
//    }
//}

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode reverseList(ListNode head) {
//
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while(curr != null)
//        {
//            ListNode forward = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = forward;
//        }
//        return prev;
//    }
//}



/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

//class Solution {
//    public ListNode middleOfLinkedList(ListNode head) {
//        ListNode temp = head;
//        int count = 0;
//        while(temp != null)
//        {
//            count++;
//            temp = temp.next;
//        }
//        int  mid = count/2;
//
//        temp = head;
//        for(int i = 1;i<=mid;i++)
//        {
//            temp = temp.next;
//        }
//        return temp;
//
//    }
//}

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode reverseList(ListNode head)
//    {
//        ListNode prev = null;
//        ListNode curr = head;
//        while(curr != null)
//        {
//            ListNode forward = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = forward;
//        }
//        return prev;
//    }
//    public boolean isPalindrome(ListNode head) {
//
//        if(head == null || head.next == null)
//        {
//            return true;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast.next != null && fast.next.next != null)
//        {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        ListNode secodHalf = reverseList(slow.next);
//        ListNode firstHalf = head;
//        ListNode temp = secodHalf;
//        while(temp != null)
//        {
//            if(firstHalf.val != temp.val)
//            {
//                return false;
//            }
//            firstHalf = firstHalf.next;
//            temp = temp.next;
//        }
//        return true;
//    }
//}


/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null)
//        {
//            return null;
//        }
//        ListNode a = headA;
//        ListNode b = headB;
//
//        while(a != null && b != null)
//        {
//            a = a.next;
//            b = b.next;
//        }
//        if(a == null)
//        {
//            int bextralen = 0;
//            while(b != null)
//            {
//                bextralen++;
//                b = b.next;
//            }
//            while(bextralen-- >0)
//            {
//                headB = headB.next;
//            }
//        }
//        else
//        {
//            int aextralen = 0;
//            while(a != null)
//            {
//                aextralen++;
//                a = a.next;
//            }
//            while(aextralen-- >0)
//            {
//                headA = headA.next;
//            }
//        }
//
//        while(headA != null && headB != null)
//        {
//            if(headA == headB)
//            {
//                return headA;
//            }
//            else
//            {
//                headA = headA.next;
//                headB = headB.next;
//            }
//        }
//        return null;
//
//    }
//}
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public boolean hasCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast != null)
//        {
//            fast = fast.next;
//            if(fast != null)
//            {
//                fast = fast.next;
//                slow = slow.next;
//                if(slow == fast)
//                {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }
//}

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode findStartingPoint(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        boolean  hascycle = false;
//
//        while(fast != null)
//        {
//            fast = fast.next;
//            if(fast != null)
//            {
//                fast = fast.next;
//                slow = slow.next;
//
//            }
//            if(slow == fast)
//            {
//                hascycle = true;
//                break;
//            }
//        }
//
//        if(hascycle == false)
//        {
//            return null;
//        }
//
//        slow = head;
//        while(fast != slow)
//        {
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        return slow;
//
//
//
//    }
//}

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//        ListNode dummy = new ListNode(-1);
//        ListNode anshead = dummy;
//        ListNode anstail = dummy;
//
//        while(list1 != null && list2 != null)
//        {
//            if(list1.val < list2.val)
//            {
//                anstail.next = list1;
//                list1 = list1.next;
//                anstail = anstail.next;
//            }
//            else
//            {
//                anstail.next = list2;
//                list2 = list2.next;
//                anstail = anstail.next;
//            }
//        }
//        if(list1 != null)
//        {
//            anstail.next = list1;
//        }
//        if(list2 != null)
//        {
//            anstail.next = list2;
//        }
//
//        return anshead.next;
//
//    }
//}

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

//class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//
//        if(head == null || k == 0)
//        {
//            return head;
//        }
//        int len = 1;
//        ListNode temp = head;
//        // yahan hame apni length calculate ker lena or temp ko fix
//        // ker dena vahan jahan se list ko cycklic ker dena hain ;
//        while(temp.next != null)
//        {
//            len++;
//            temp = temp.next;
//        }
//
//        // yahan hame apni linkedlist ko cycklic bana dena;
//
//        temp.next = head;
//
//        k = k % len;
//        // yahan se muje apne k ko calculate ker lena or us jagah tak le jana hain jahan se
//        //list ko break kerna hain;
//        temp = head;
//        for(int i = 1;i<=len-k-1;i++)
//        {
//            temp = temp.next;
//        }
//        ListNode forward = temp.next;
//
//
//        // yahan se muje apni linkedlist ko break ker dena hain;
//        temp.next = null;
//
//        // new head return ker dena  hain
//        return forward;
//
//    }
//}
//
///*Definition of doubly linked list:
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode prev;
//
//    ListNode() {
//        val = 0;
//        next = null;
//        prev = null;
//    }
//
//    ListNode(int data1) {
//        val = data1;
//        next = null;
//        prev = null;
//    }
//
//    ListNode(int data1, ListNode next1, ListNode prev1) {
//        val = data1;
//        next = next1;
//        prev = prev1;
//    }
//}
// */
//
//class Solution {
//    public ListNode deleteAllOccurrences(ListNode head, int target) {
//        if(head == null )
//        {
//            return head;
//        }
//        ListNode temp = head;
//
//        while(temp != null)
//        {
//            if(temp.val == target)
//            {
//                if(temp.prev ==  null)
//                {
//                    head = temp.next;
//                }
//                else
//                {
//                    temp.prev.next = temp.next;
//                }
//                if(temp.next != null)
//                {
//                    temp.next.prev = temp.prev;
//
//                }
//
//
//            }
//            temp = temp.next;
//        }
//        return head;
//
//    }
//}

/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

//class Solution {
//    public ListNode removeDuplicates(ListNode head) {
//        if(head == null || head.next == null)
//        {
//            return head;
//        }
//        ListNode temp = head;
//
//        while(temp != null && temp.next != null)
//        {
//            if(temp.val == temp.next.val)
//            {
//                temp.next = temp.next.next;
//
//                if(temp.next != null)
//                {
//                    temp.next.prev = temp;
//                }
//
//            }
//            else
//            {
//
//                temp = temp.next;
//            }
//        }
//        return head;
//
//    }
//}
//class Solution {
//    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        if (head == null || head.next == null) {
//            return ans;
//        }
//
//        ListNode tail = head;
//
//        while (tail.next != null) {
//            tail = tail.next;
//        }
//
//        ListNode first = head;
//        ListNode last = tail;
//
//        while (first != last && first.prev != last) {
//
//            int sum = first.val + last.val;
//
//            if (sum == target) {
//                ans.add(Arrays.asList(first.val, last.val));
//
//                first = first.next;
//                last = last.prev;
//            }
//            else if (sum < target) {
//                first = first.next;
//            }
//            else {
//                last = last.prev;
//            }
//        }
//
//        return ans;
//    }
//}
//

//class Solution {
//    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
//
//        List<List<Integer>> ans = new ArrayList<>();
//
//        if (head == null || head.next == null) {
//            return ans;
//        }
//
//        ListNode tail = head;
//
//        while (tail.next != null) {
//            tail = tail.next;
//        }
//
//        ListNode first = head;
//        ListNode last = tail;
//
//        while (first != last && first.prev != last) {
//
//            int sum = first.val + last.val;
//
//            if (sum == target) {
//                ans.add(Arrays.asList(first.val, last.val));
//
//                first = first.next;
//                last = last.prev;
//            }
//            else if (sum < target) {
//                first = first.next;
//            }
//            else {
//                last = last.prev;
//            }
//        }
//
//        return ans;
//    }
//}
//

/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {

    public ListNode flattenLinkedList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Pehle right side ki lists ko flatten karo
        head.next = flattenLinkedList(head.next);

        // Current list aur flattened list ko merge karo
        head = merge(head, head.next);

        return head;
    }

    private ListNode merge(ListNode a, ListNode b) {

        // Temporary node
        ListNode dummy = new ListNode(0);

        // Result list banane ke liye
        ListNode temp = dummy;

        // Dono lists ko compare karo
        while (a != null && b != null) {

            if (a.val <= b.val) {
                temp.child = a;
                a = a.child;
            } else {
                temp.child = b;
                b = b.child;
            }

            temp = temp.child;
        }

        // Jo list bach gayi hai, use attach karo
        if (a != null) {
            temp.child = a;
        } else {
            temp.child = b;
        }

        // Sabhi next pointers ko null karo
        ListNode curr = dummy.child;

        while (curr != null) {
            curr.next = null;
            curr = curr.child;
        }

        // Final flattened list ka head
        return dummy.child;
    }
}


