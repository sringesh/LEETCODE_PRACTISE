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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result= new ArrayList<>();
       // if(root==null){
       //     result.add(0);
       //     return result;
       // }
        fun(root,result);
        return result;
    }
    public void fun(TreeNode root,ArrayList<Integer>result){
        if(root==null){
            return ;
        }
        result.add(root.val);
        fun(root.left,result);
        fun(root.right,result);
    }
}