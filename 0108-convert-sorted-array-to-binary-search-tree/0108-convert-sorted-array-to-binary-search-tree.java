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
    public TreeNode sortedArrayToBST(int[] nums) {
    
        return change(nums,0,nums.length-1);
    }

    private TreeNode change(int [] arr,int low,int hi){
        if(low>hi) return null;
        int mid=low+(hi-low)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=change(arr,low,mid-1);
        node.right=change(arr,mid+1,hi);


        return node;
    }
}