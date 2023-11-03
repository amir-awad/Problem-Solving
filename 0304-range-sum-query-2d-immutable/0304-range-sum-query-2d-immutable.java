class NumMatrix {
    int[][] matrix;
    int m;
    int n;
    int[][] pref;
    
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.pref = new int[m + 1][n + 1];
        calculatePref();
    }
    
    public void calculatePref() {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = pref[i][j - 1] + pref[i - 1][j] - pref[i - 1][j - 1] + matrix[i - 1][j - 1];   
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        int ans = pref[row2][col2] - pref[row1 - 1][col2] - pref[row2][col1 - 1] + pref[row1 - 1][col1 - 1];        
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */