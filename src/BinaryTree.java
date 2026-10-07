////public class BinaryTree {
//// static class Node
//// {
////     int data;
////     Node left;
////     Node right;
////
////     Node(int data)
////     {
////         this.data = data;
////         this.left = null;
////         this.right = null;
////     }
////     static class Binarytree{
////         static int idx = -1;
////         public static Node buildtree(int[] Nodes)
////         {
////             idx++;
////             if(Nodes[idx] == -1)
////             {
////                 return null;
////             }
////             Node newNode = new Node(Nodes[idx]);
////             newNode.left = buildtree(Nodes);
////             newNode.right = buildtree(Nodes);
////
////             return newNode;
////         }
////     }
////     public static void main(String[] args)
////     {
////          int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
////          Binarytree tree = new Binarytree();
////          Node Root = tree.buildtree(Nodes);
////          System.out.println(Root.data);
////     }
//// }
//////    class Solution {
//////        public List<Integer> preorder(TreeNode root) {
//////            List<Integer> list = new ArrayList<>();
//////            if(root == null)
//////            {
//////                return list;
//////            }
//////            list.add(root.data);
//////            list.addAll(preorder(root.left));
//////            list.addAll(preorder(root.right));
//////
//////            return list;
//////        }
//////    }
//////
//////    class Solution {
//////        public List<Integer> postorder(TreeNode root) {
//////            List<Integer> list = new ArrayList<>();
//////            if(root == null)
//////            {
//////                return list;
//////            }
//////
//////            list.addAll(postorder(root.left));
//////
//////            list.addAll(postorder(root.right));
//////            list.add(root.data);
//////
//////            return list;
//////
//////        }
//////    }
//////
//////    class Solution {
//////        public List<Integer> inorder(TreeNode root) {
//////            List<Integer> list = new ArrayList<>();
//////            if(root == null)
//////            {
//////                return list;
//////            }
//////
//////            list.addAll(inorder(root.left));
//////            list.add(root.data);
//////            list.addAll(inorder(root.right));
//////
//////            return list;
//////
//////        }
//////    }
////
////    /**
////     * Definition for a binary tree node.
////     * public class TreeNode {
////     *     int data;
////     *     TreeNode left;
////     *     TreeNode right;
////     *     TreeNode(int val) { data = val; left = null, right = null }
////     * }
////     **/
////
////    class Solution {
////        public List<List<Integer>> levelOrder(TreeNode root) {
////            List<List<Integer>> result = new ArrayList<>();
////
////            if (root == null) {
////                return result;
////            }
////
////            Queue<TreeNode> q = new LinkedList<>();
////            q.add(root);
////
////            while (!q.isEmpty()) {
////                int size = q.size();
////                List<Integer> level = new ArrayList<>();
////
////                for (int i = 0; i < size; i++) {
////                    TreeNode node = q.poll();
////
////                    level.add(node.data);
////
////                    if (node.left != null) {
////                        q.add(node.left);
////                    }
////
////                    if (node.right != null) {
////                        q.add(node.right);
////                    }
////                }
////
////                result.add(level);
////            }
////
////            return result;
////        }
////    }
////// height of binary tree;
////
////    /**
////     * Definition for a binary tree node.
////     * public class TreeNode {
////     *     int data;
////     *     TreeNode left;
////     *     TreeNode right;
////     *     TreeNode(int data) { data = data; left = null, right = null }
////     * }
////     **/
////
////    class Solution {
////        public int maxDepth(TreeNode root) {
////            if(root  == null)
////            {
////                return  0;
////
////            }
////
////            int lh = maxDepth(root.left);
////            int rh = maxDepth(root.right);
////
////            return Math.max(lh , rh)+1;
////        }
////    }
//
//
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int data;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int val) { data = val; left = null, right = null }
// * }
// **/
//
//class Solution {
//    public int maxPathSum(TreeNode root) {
//        int maxvalue[] = new int[1];
//        maxvalue[0] = Integer.MIN_VALUE;
//        maxPathDown(root , maxvalue);
//        return maxvalue[0];
//    }
//    private int maxPathDown(TreeNode node , int maxvalue[])
//    {
//        if(node == null)
//        {
//            return 0;
//        }
//        int leftsum = Math.max(0 , maxPathDown(node.left , maxvalue));
//        int rightsum = Math.max(0 , maxPathDown(node.right , maxvalue));
//        maxvalue[0] = Math.max(maxvalue[0] , leftsum+rightsum+node.data);
//
//        return Math.max(leftsum , rightsum) + node.data;
//    }
//}
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int data;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int val) { data = val; left = null, right = null }
// * }
// **/
//
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        return root == null || isSymmetricHelp(root.left , root.right);
//    }
//    private boolean isSymmetricHelp(TreeNode left , TreeNode right)
//    {
//        if(left == null || right == null)
//        {
//            return left == right;
//        }
//        if(left.data != right.data) return false;
//
//        return isSymmetricHelp(left.left , right.right)
//                && isSymmetricHelp(left.right , right.left);
//    }
//}

// class TreeNode {
//     int val;
//     TreeNode left, right;
//     TreeNode(int x) { val = x; }
// }

class Solution {
    boolean checkChildrenSum(TreeNode root) {
        // yahan to root node ko check kerte jao bas;
        if (root == null) {
            return true;
        }

        // yahan leaf node kerte jana bas or neeche kuch bi nhi to return true;
        if (root.left == null && root.right == null) {
            return true;
        }
        // that is follow the condition
        //if(root,left != null)
        // {
        //   left =  root.left.data;
        // }
        // else
        // {
        //     left = 0;
        // }
        int left = (root.left != null) ? root.left.val : 0;
        int right = (root.right != null) ? root.right.val : 0;

        if (root.val != left + right) {
            return false;
        }
// yahan ham baar baar check kerte jate pure tree ko;
        return checkChildrenSum(root.left)
                && checkChildrenSum(root.right);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.data);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            result.add(level);
            leftToRight = !leftToRight;
        }

        return result;
    }
}
////}
