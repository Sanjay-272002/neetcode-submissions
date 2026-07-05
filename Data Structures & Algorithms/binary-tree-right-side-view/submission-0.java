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

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> stq=new LinkedList<>();
        if(root==null) return result;
        stq.offer(root);
        while(!stq.isEmpty()){
            int size=stq.size();
            for(int i=0;i<size;i++){
                TreeNode curr=stq.poll();
                if(i==size-1){
                    result.add(curr.val);
                }
                if(curr.left!=null)stq.offer(curr.left);
                if(curr.right!=null)stq.offer(curr.right);
            }
        }
        return result;
    }
}
