//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//public class BinaryTreeSolution {
//         public static int heigthoftree(Node root)
//         {
//             if(root == null)
//             {
//                 return 0;
//
//             }
//
//             int lh = heigthoftree(root.left);
//             int rh = heigthoftree(root.right);
//
//             return Math.max(lh , rh)+1;
//         }
//    public static int countnodes(Node root)
//    {
//        if(root == null)
//        {
//            return 0;
//        }
//        int leftcount = countnodes(root.left);
//        int rightcount = countnodes(root.right);
//
//        return leftcount+rightcount+1;
//    }
//    public static int sum(Node root)
//    {
//        if(root == null)
//        {
//            return 0;
//        }
//        int lsum = sum(root.left);
//        int rsum = sum(root.right);
//
//        return lsum+rsum+root.data;
//    }
//    public static int diameter2(Node root) // time consume o(n*n)
//    {
//        if(root == null)
//        {
//            return 0;
//        }
//        int leftdia = diameter2(root.left);
//        int leftheight = heigthoftree(root.left);
//        int rightdia = diameter2(root.right);
//        int rightheight = heigthoftree(root.right);
//
//        int selfdia = leftheight+rightheight+1;
//        return Math.max(selfdia , Math.max(leftdia , rightdia));
//    }
//    static class info
//    {
//        int diam;
//        int ht;
//        info(int diam , int ht)
//        {
//            this.diam = diam;
//            this.ht = ht;
//        }
//    }
//    public static info Diameter(Node root)
//    {
//        if(root == null)
//        {
//            return new info(0 , 0);
//        }
//        info leftinfo = Diameter(root.left);
//        info rightinfo = Diameter(root.right);
//        int diam = Math.max(Math.max(leftinfo.diam , rightinfo.diam) ,leftinfo.ht+rightinfo.ht+1);
//        int ht = Math.max(leftinfo.ht , rightinfo.ht) + 1;
//        return new info(diam , ht);
//
//    }
//    public static void klevel(Node root  , int level , int k)
//    {
//        if(root == null)
//        {
//            return;
//        }
//        if(root.data == k)
//        {
//            System.out.print(root.data+ " ");
//            return;
//        }
//        klevel(root.left , level+1 , k);
//        klevel(root.right , level+1 ,k );
//    }
//         public static void main(String[] args)
//         {
//             Node root = new Node(1);
//             root.left = new Node(2);
//             root.right = new Node(3);
//             root.left.left = new Node(4);
//             root.left.right = new Node(5);
//             root.right.right = new Node(6);
//             root.right.left = new Node(7);
//
//            // System.out.println(heigthoftree(root));
//            // System.out.println(countnodes(root));
//             //System.out.println(sum(root));
//            //System.out.println(diameter(root));
//             //System.out.println(Diameter(root).diam);
//             //System.out.println(Diameter(root).ht);
//
//             int k = 2;
//             klevel(root , 1 ,k);
//
//
//
//
//         }
//
//
//
//}
//
//
