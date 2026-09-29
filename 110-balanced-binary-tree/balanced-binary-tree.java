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
        if(root==null) return true;
        int leftside=high(root.left);
        int rightside=high(root.right);
        if(Math.abs(leftside-rightside)>1){
            return false;
        }
        return  isBalanced(root.left)&&isBalanced(root.right);
        
    }
     
    public int high(TreeNode root){
        if (root==null)return 0;
        int lefthigh=high(root.left);
        int righthigh=high(root.right);
        return 1+Math.max(lefthigh,righthigh);
    }

}