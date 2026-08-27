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
    int sum=0;
   
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        int left=0;
        int right=0;

        if(root.val<low) return rangeSumBST(root.right,low,high);
        if(root.val>high) return rangeSumBST(root.left,low,high);
        if(root.val>=low && root.val<=high){
             left=rangeSumBST(root.left,low,high);
             right=rangeSumBST(root.right,low,high);

             return sum=root.val+left+right;
        }

        return sum;
    }
}