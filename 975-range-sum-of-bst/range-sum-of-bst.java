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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = sum(root,low,high);
        return sum;
    }
    public int sum(TreeNode root,int low,int high){
        if (root == null) {
            return 0;
        }
        int s = 0;
        s += sum(root.left, low, high);
        if (root.val >= low && root.val <= high) {
            s += root.val;
        }
        s += sum(root.right, low, high);

        return s;
    }
}