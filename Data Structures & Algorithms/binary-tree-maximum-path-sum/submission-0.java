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
     int maximum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    findMax(root);
        return maximum;
    }
    int findMax(TreeNode root){
        if(root==null) return 0;

        int left=findMax(root.left);
        int right=findMax(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int sum=left+right+root.val;
        maximum= Math.max(maximum,sum);
        return Math.max(left,right)+root.val;
    }
}
