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
    int res=0;
    public int goodNodes(TreeNode root) {
         count(root,Integer.MIN_VALUE);
         return res;
    }
    void count(TreeNode root, int max){
        if(root==null) return;
        if(root.val>=max) res+=1;
        max=Math.max(max,root.val);
        count(root.left,max);
        count(root.right,max);
    }
}
