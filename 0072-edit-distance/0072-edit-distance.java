/*class Solution {
    public int edit(String s1,String s2,int m,int n){
        if(m==0) return n;
        if(n==0) return m;

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return edit(s1,s2,m-1,n-1);
        }
        else{

            int x=edit(s1,s2,m,n-1);
            int y=edit(s1,s2,m-1,n-1);
            int z=edit(s1,s2,m-1,n);

            return 1+Math.min(x,Math.min(y,z));
        }

    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        return edit(word1,word2,m,n);
    }
}
*/
// Dp solution as my code give TLE

class Solution {

    int[][] dp;

    public int edit(String s1, String s2, int m, int n) {

        if (m == 0) return n;
        if (n == 0) return m;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return dp[m][n] = edit(s1, s2, m - 1, n - 1);
        }

        int insert = edit(s1, s2, m, n - 1);
        int replace = edit(s1, s2, m - 1, n - 1);
        int delete = edit(s1, s2, m - 1, n);

        return dp[m][n] = 1 + Math.min(insert, Math.min(replace, delete));
    }

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return edit(word1, word2, m, n);
    }
}