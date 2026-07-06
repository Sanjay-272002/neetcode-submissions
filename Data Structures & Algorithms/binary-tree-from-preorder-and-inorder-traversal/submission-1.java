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
    int pre_idx=0;
    HashMap<Integer,Integer> st=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++){
            st.put(inorder[i],i);
        }
        return build(preorder,0,preorder.length-1);
    }
    TreeNode build(int [] preorder,int s,int end){
if(s>end) return null;
int root_ind=st.get(preorder[pre_idx]);
TreeNode root=new TreeNode(preorder[pre_idx++]);
root.left=build(preorder,s,root_ind-1);
root.right=build(preorder,root_ind+1,end);
return root;
    }
}
