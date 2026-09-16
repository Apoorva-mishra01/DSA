class Solution {
    public int numberOfSets(int n, int k) {
        final int MOD = 1000000007;

        
        long[][] dp = new long[n][k + 1];

       
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j <= k; j++) {
            long prefix = 0;

            for (int i = 0; i < n; i++) {

                
                if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                }

                
                if (i > 0) {
                    prefix = (prefix + dp[i - 1][j - 1]) % MOD;
                    dp[i][j] = (dp[i][j] + prefix) % MOD;
                }
            }
        }

        return (int) dp[n - 1][k];
    }
}