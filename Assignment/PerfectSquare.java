import java.util.*;

class PerfectSquare{


    public int numSquares(int n) {
        int[] dp = new int[n + 1];
	int nearest;
	for (int i = 1; i <= n; i++) {
		nearest = (int) Math.sqrt(i);
		int min = dp[i - 1];
		for (int j = nearest; j > 0; j--) {
			if (dp[i - j * j] < min)
				min = dp[i - j * j];
		}
		dp[i] = min + 1;
	}

	return dp[n];
        
    }
}