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

    private int solve(TreeNode root , int path){
        if(root == null) return 0;

        path = path * 10 + root.val;

        if(root.left == null && root.right == null){
            return path;
        }

        return solve(root.left , path) + solve(root.right , path);


    }

    public int sumNumbers(TreeNode root) {


     return solve(root, 0);   
    }
}
