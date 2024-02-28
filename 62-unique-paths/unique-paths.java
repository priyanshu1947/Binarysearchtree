import java.util.ArrayList;

class Solution {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(-1);
            }
            ans.add(row);
        }
        return countPaths(0, 0, m, n, ans);
    }

    public int countPaths(int i, int j, int m, int n, ArrayList<ArrayList<Integer>> ans) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (ans.get(i).get(j) != -1) {
            return ans.get(i).get(j);
        }

        int paths = countPaths(i + 1, j, m, n, ans) + countPaths(i, j + 1, m, n, ans);
        ans.get(i).set(j, paths);

        return paths;
    }
}
