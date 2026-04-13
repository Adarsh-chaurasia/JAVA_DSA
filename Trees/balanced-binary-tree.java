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
    private int getHeight(TreeNode root){

        if(root == null) return 0;

        int leftHeight = getHeight(root.left);

        if(leftHeight == -1) return -1;

        int righttHeight = getHeight(root.right);

        if(righttHeight == -1) return -1;


        if(Math.abs(leftHeight-righttHeight) > 1)
         return -1;


        return Math.max(leftHeight , righttHeight) + 1;

    }

    public boolean isBalanced(TreeNode root) {

       
                return getHeight(root) != -1;



    }
}balanced-binary-tree
