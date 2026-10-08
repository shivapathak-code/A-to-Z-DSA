import java.util.*;
public class TreeDs {

    static class TreeNode<E>{
        E data;
        TreeNode left;
        TreeNode right;

        public TreeNode(E data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
             root.left = new TreeNode(2);
             root.right = new TreeNode(3);
             root.left.left = new TreeNode(4);
             root.left.right = new TreeNode(5);
             root.right.right = new TreeNode(6);
             root.right.left = new TreeNode(7);
             System.out.print(BFS(root));
    }
    public static ArrayList<Integer> BFS(TreeNode<Integer> root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            TreeNode<Integer> node = queue.poll();
            ans.add(node.data);

            if(node.left != null)
            {
                queue.offer(node.left);
            }
            if(node.right != null)
            {
                queue.offer(node.right);
            }

        }
        return ans;
    }
}
