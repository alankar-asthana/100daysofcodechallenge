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

    public int height(TreeNode root){
        if(root==null) return 0;
        
        int lht = height(root.left);
        int rht = height(root.right);
        
        return Math.max(lht,rht)+1;       
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(root.left==null && root.right==null)
            return true;
            
        int lht = height(root.left);
        int rht = height(root.right);
        
        if(Math.abs(lht-rht)>1){
            return false;
        }
        
        boolean checkLeft = isBalanced(root.left);
        boolean checkRight = isBalanced(root.right);
        
        if(checkLeft == false || checkRight == false) return false;
        
        return true;
    }
}
