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
    private static int solve(TreeNode root,int nums){
        if(root==null) return 0;
        nums=nums*10+root.val;
        if(root.left==null && root.right==null) return nums;
        int l=solve(root.left,nums);
        int r=solve(root.right,nums);
        return l+r;
    }
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }
}