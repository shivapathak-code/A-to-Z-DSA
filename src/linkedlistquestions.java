public class linkedlistquestions {
    // flattern a multi level linkedlist;
    public static void main(String[] args)
    {
        // here is a class when we run this code in any other complier then so that is work as function ;
        node head;
        if(head == null)
        {
            return head;
        }
        node p = head;

        while(p!=null)
        {
            if(p.child == null)
            {
                p = p.next;
            }
            else
            {
                node temp = p.child;
                while(temp.next!=null)
                {
                    temp = temp.next;

                }
                temp.next = p.next;
                if(p.next!=null) {
                    p.next.prev = temp;
                }
                p.next = p.child;
                p.child.prev = p;
                p.child = null;
            }
        }
        return head;
    }
}
