public class BinaryTree {

    class Solution {
        public List<Integer> preorder(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null)
            {
                return list;
            }
            list.add(root.data);
            list.addAll(preorder(root.left));
            list.addAll(preorder(root.right));

            return list;
        }
    }

    class Solution {
        public List<Integer> postorder(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null)
            {
                return list;
            }

            list.addAll(postorder(root.left));

            list.addAll(postorder(root.right));
            list.add(root.data);

            return list;

        }
    }
}
