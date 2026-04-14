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

    int maxSum = Integer.MIN_VALUE;

    private int dfs(TreeNode node){

        if(node == null) return 0;


        int leftMax = Math.max(0, dfs(node.left));

        int rightMax = Math.max(0, dfs(node.right));

        maxSum = Math.max(maxSum , leftMax + rightMax + node.val);

        return Math.max(leftMax , rightMax) + node.val;

    }

    public int maxPathSum(TreeNode root) {


        dfs(root);

        return maxSum;
        
    }
}
