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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
       fun(root,result);
       return result;
        
    }
    public void fun(TreeNode root,ArrayList<Integer>result){
         
        if(root==null){
            
            return;
        }
       
        
        
       fun(root.left,result);
       
       fun(root.right,result);
       result.add(root.val);
    }
}