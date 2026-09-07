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
    private void arrlist(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        arrlist(root.left,arr);
        arrlist(root.right,arr);
    }
    public int[] findMode(TreeNode root) {

        if (root == null) return new int[0];
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arrlist(root,arr);
        Collections.sort(arr);
        int i=0;
        int j=i;
        int max=0;
        while(i<arr.size()){
            int count=0;
            while(j<arr.size() && arr.get(i).equals(arr.get(j))){
                count++;
                j++;
            }
            if(count>max){
                ans.clear();
                ans.add(arr.get(i));
                max=count;
            }
            else if(count==max) {
                ans.add(arr.get(i));
            }
            i=j;
        }
        int[] result = new int[ans.size()];
        for (int k=0;k<ans.size();k++) {
            result[k]=ans.get(k);
        }


    return result;

    }
}