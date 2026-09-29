class Solution {
    public int maxDepth(String s) {
        int x = 0, y = 0;

        for (char z : s.toCharArray()) {
            if (z == '(') {
                x++;
                y = Math.max(y, x);
            } else if (z == ')') {
                x--;
            }
        }

        return y;
    }
}
