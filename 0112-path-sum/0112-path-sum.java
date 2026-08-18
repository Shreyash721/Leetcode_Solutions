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
    public boolean hasPathSum(TreeNode root, int x) {

        if(root==null) return false;

        if(root.right==null && root.left==null){
            return root.val==x;
        }

        x=x-root.val;

        return (hasPathSum(root.left,x)||hasPathSum(root.right,x));

    }
}