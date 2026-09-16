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
//}
