// import java.util.*;
// class Solution {
//     public int minimumChanges(String s, int k) {
//         int n = s.length();
//         int[][] cost = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int len = j - i + 1;
//                 int min = n;
//                 for (int d = 1; d < len; d++) {
//                     if (len % d != 0) continue;
//                     int changes = 0;
//                     for (int x = 0; x < d; x++) {
//                         int l = i + x;
//                         int r = j - d + 1 + x;
//                         while (l < r) {
//                             if (s.charAt(l) != s.charAt(r)) {
//                                 changes++;
//                             }
//                             l += d;
//                             r -= d;
//                         }
//                     }
//                     min = Math.min(min, changes);
//                 }
//                 cost[i][j] = min;
//             }
//         }
//         int[][] dp = new int[n + 1][k + 1];
//         for (int[] row : dp) {
//             Arrays.fill(row, 100000);
//         }
//         dp[0][0] = 0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= k; j++) {
//                 for (int p = 0; p < i - 1; p++) {
//                     dp[i][j] = Math.min(
//                         dp[i][j],
//                         dp[p][j - 1] + cost[p + 1][i - 1]);
//                 }
//             }
//         }
//         return dp[n][k];
//     }
// }

import java.util.*;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();

        int[][] cost = new int[n][n];

        // Step 1: Precompute substring costs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int len = j - i + 1;
                int min = n;

                for (int d = 1; d < len; d++) {
                    if (len % d != 0) continue;

                    int changes = 0;

                    for (int x = 0; x < d; x++) {
                        int l = i + x;
                        int r = j - d + 1 + x;

                        while (l < r) {
                            if (s.charAt(l) != s.charAt(r)) {
                                changes++;
                            }

                            l += d;
                            r -= d;
                        }
                    }

                    min = Math.min(min, changes);
                }

                cost[i][j] = min;
            }
        }

        // Step 2: DP
        int INF = 100000;

        int[][] dp = new int[n + 1][k + 1];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {

                for (int p = 0; p <= i - 2; p++) {

                    if (dp[p][j - 1] == INF) continue;

                    dp[i][j] = Math.min(
                        dp[i][j],
                        dp[p][j - 1] + cost[p][i - 1]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
