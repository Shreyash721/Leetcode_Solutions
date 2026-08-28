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

class quad{
    int max;
    int min;
    int sum;
    boolean isbst;

    quad(int max,int min,int sum,boolean isbst){

        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isbst=isbst;
    }
}
class Solution {
    int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        helper(root);
        return maxSum;
    }
    int sum=0;
    quad helper(TreeNode root){

        if(root==null) return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);

        quad lst=helper(root.left);
        quad rst=helper(root.right);

        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));

        int sum=root.val+lst.sum+rst.sum;

        boolean isbst=lst.isbst && rst.isbst && (lst.max<root.val && rst.min>root.val);

        if(isbst) maxSum=Math.max(sum,maxSum);

        return new quad(max,min,sum,isbst);

    }
}