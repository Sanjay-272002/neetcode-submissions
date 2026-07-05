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
    int counter=0;
    public int kthSmallest(TreeNode root, int k) {
        return inorderTraversal(root,k); 
    }
    int inorderTraversal(TreeNode root,int k){
        if(root ==null) return -1;

        int left =inorderTraversal(root.left,k);
        counter++;
         if(k - counter == 0) {
            return root.val;
        }
        if(left>-1) return left;
         return inorderTraversal(root.right, k);
    }
}
