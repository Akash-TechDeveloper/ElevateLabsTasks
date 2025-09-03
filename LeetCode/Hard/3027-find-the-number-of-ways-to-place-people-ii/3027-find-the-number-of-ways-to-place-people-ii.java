import java.util.*;

public class Solution {
    public int numberOfPairs(int[][] P) {
        Arrays.sort(P, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(b[0], a[0]);
            }
        });

        int n = P.length;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            int yi = P[i][1];
            int y = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                int yj = P[j][1];
                if (yj >= yi && y > yj) {
                    ans++;
                    y = yj;
                }
            }
        }

        return ans;
    }
}
