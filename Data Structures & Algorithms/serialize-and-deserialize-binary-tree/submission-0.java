/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

     public String serialize(TreeNode root) {
        if(root==null) return "null";
        return root.val+","+serialize(root.left)+","+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> st=new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(st);
    }
    TreeNode buildTree(Queue<String> queue){
        String curr=queue.poll();
        if(curr.equals("null")) return null;
        TreeNode node=new TreeNode(Integer.parseInt(curr));
        node.left=buildTree(queue);
        node.right=buildTree(queue);
        return node;
    }
}
