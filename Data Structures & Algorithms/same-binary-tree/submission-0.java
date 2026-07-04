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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      return isEquivalent(p,q);
    }

    boolean isEquivalent(TreeNode p,TreeNode q){
         if(p==null && q==null) return true;
        if( (p==null && q!=null) || (p!=null && q==null) || p.val !=q.val) return false;
       

        boolean left=isEquivalent(p.left,q.left);
        boolean right=isEquivalent(p.right,q.right);
        return left && right;
    }
}
