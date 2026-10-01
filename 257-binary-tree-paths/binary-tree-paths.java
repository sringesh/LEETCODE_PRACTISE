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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        fun(root,"",result);

        return result;
        
    }
    public void fun(TreeNode root,String path,ArrayList<String> result ){

        if(root==null){
            return;
        }
        path = path+root.val;
        if(root.left==null && root.right==null){
            result.add(path);
            return ;
        }
        fun(root.left,path+"->",result);
        fun(root.right,path+"->",result);
    }
}