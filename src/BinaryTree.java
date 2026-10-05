//public class BinaryTree {
// static class Node
// {
//     int data;
//     Node left;
//     Node right;
//
//     Node(int data)
//     {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
//     static class Binarytree{
//         static int idx = -1;
//         public static Node buildtree(int[] Nodes)
//         {
//             idx++;
//             if(Nodes[idx] == -1)
//             {
//                 return null;
//             }
//             Node newNode = new Node(Nodes[idx]);
//             newNode.left = buildtree(Nodes);
//             newNode.right = buildtree(Nodes);
//
//             return newNode;
//         }
//     }
//     public static void main(String[] args)
//     {
//          int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//          Binarytree tree = new Binarytree();
//          Node Root = tree.buildtree(Nodes);
//          System.out.println(Root.data);
//     }
// }
////    class Solution {
////        public List<Integer> preorder(TreeNode root) {
////            List<Integer> list = new ArrayList<>();
////            if(root == null)
////            {
////                return list;
////            }
////            list.add(root.data);
////            list.addAll(preorder(root.left));
////            list.addAll(preorder(root.right));
////
////            return list;
////        }
////    }
////
////    class Solution {
////        public List<Integer> postorder(TreeNode root) {
////            List<Integer> list = new ArrayList<>();
////            if(root == null)
////            {
////                return list;
////            }
////
////            list.addAll(postorder(root.left));
////
////            list.addAll(postorder(root.right));
////            list.add(root.data);
////
////            return list;
////
////        }
////    }
////
////    class Solution {
////        public List<Integer> inorder(TreeNode root) {
////            List<Integer> list = new ArrayList<>();
////            if(root == null)
////            {
////                return list;
////            }
////
////            list.addAll(inorder(root.left));
////            list.add(root.data);
////            list.addAll(inorder(root.right));
////
////            return list;
////
////        }
////    }
//
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int data;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int val) { data = val; left = null, right = null }
//     * }
//     **/
//
//    class Solution {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> result = new ArrayList<>();
//
//            if (root == null) {
//                return result;
//            }
//
//            Queue<TreeNode> q = new LinkedList<>();
//            q.add(root);
//
//            while (!q.isEmpty()) {
//                int size = q.size();
//                List<Integer> level = new ArrayList<>();
//
//                for (int i = 0; i < size; i++) {
//                    TreeNode node = q.poll();
//
//                    level.add(node.data);
//
//                    if (node.left != null) {
//                        q.add(node.left);
//                    }
//
//                    if (node.right != null) {
//                        q.add(node.right);
//                    }
//                }
//
//                result.add(level);
//            }
//
//            return result;
//        }
//    }
//// height of binary tree;
//
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int data;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode(int data) { data = data; left = null, right = null }
//     * }
//     **/
//
//    class Solution {
//        public int maxDepth(TreeNode root) {
//            if(root  == null)
//            {
//                return  0;
//
//            }
//
//            int lh = maxDepth(root.left);
//            int rh = maxDepth(root.right);
//
//            return Math.max(lh , rh)+1;
//        }
//    }
//}
