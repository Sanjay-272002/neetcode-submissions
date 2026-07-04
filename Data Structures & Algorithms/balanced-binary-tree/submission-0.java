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
    public boolean isBalanced(TreeNode root) {
        return decision(root)!=-1;
    }
    int  decision(TreeNode root){
        if(root==null) return 0;

        int left=decision(root.left);
        int right=decision(root.right);
        if(left==-1 || right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        
        return 1+Math.max(left,right);
    }
}
