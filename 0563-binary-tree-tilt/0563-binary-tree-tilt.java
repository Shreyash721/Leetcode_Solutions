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

    private int sum(TreeNode root){
        if(root==null) return 0;
        int l=sum(root.left);
        int r=sum(root.right);
        return root.val+l+r;
    }
    int sum=0;
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        sum=sum+Math.abs(sum(root.left)-sum(root.right));
        findTilt(root.left);
        findTilt(root.right);
        return sum;
    } 
}