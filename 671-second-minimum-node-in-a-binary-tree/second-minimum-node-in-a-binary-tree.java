class Solution {

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }

        int left = root.left.val;
        int right = root.right.val;
        if (left > root.val && right > root.val) {
            return Math.min(left, right);
        }
        int leftSecond;
        int rightSecond;
        if (left == root.val) {
            leftSecond = findSecondMinimumValue(root.left);
        } else {
            leftSecond = left;
        }
        if (right == root.val) {
            rightSecond = findSecondMinimumValue(root.right);
        } else {
            rightSecond = right;
        }
        if (leftSecond == -1) {
            return rightSecond;
        }
        if (rightSecond == -1) {
            return leftSecond;
        }
        return Math.min(leftSecond, rightSecond);
    }
}
    
