import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NarrayTree {

    static class NarrTreeNode<E>{
        E data;
        ArrayList<NarrTreeNode> children;

        public NarrTreeNode(E data)
        {
            this.data = data;
            children = new ArrayList<>();
        }
    }
    public static void main(String[] args)
    {
        NarrTreeNode root = new NarrTreeNode(1);
        root.left = new NarrTreeNode(2);
        root.right = new NarrTreeNode(3);
        root.left.left = new NarrTreeNode(4);
        root.left.right = new NarrTreeNode(5);
        root.right.right = new NarrTreeNode(6);
        root.right.left = new NarrTreeNode(7);
        System.out.print(BFS(root));
    }
    public static ArrayList<Integer> BFS(NarrTreeNode<Integer> root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<NarrTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            NarrTreeNode<Integer> node = queue.poll();
            ans.add(node.data);

            for(NarrTreeNode child : node.children) {
                if(child != null)
                {
                    queue.offer(child);
                }
            }
        }
        return ans;
    }
}
