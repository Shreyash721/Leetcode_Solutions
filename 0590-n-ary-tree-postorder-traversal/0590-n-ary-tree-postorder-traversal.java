/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        if (root == null) {
            return arr;
        }
        for(Node x : root.children){
            arr.addAll(postorder(x));
        }
        arr.add(root.val);
        return arr;
        
    }
}