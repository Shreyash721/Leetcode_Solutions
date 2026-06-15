class Solution {
    public int reverse(int x) {
        long result = rev(x);
        if (result < (-Math.pow(2, 31)) || result > (Math.pow(2, 31) - 1)) {
            return 0;
        }
        return (int) result;
    }
    private long rev(int n) {
        return rev(n, 0);
    }
    private long rev(int n, long r) {
        if (n == 0) return r;
        return rev(n / 10, r * 10 + n % 10);
    }
}