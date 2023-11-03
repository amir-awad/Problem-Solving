class NumMatrix {
    int[][] matrix;
    int m;
    int n;
    int[][] pref;
    
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.pref = new int[m][n];
        calculatePref();
    }
    
    public void calculatePref() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i > 0 && j > 0) {
                    pref[i][j] = pref[i][j - 1] + pref[i - 1][j] - pref[i - 1][j - 1] + matrix[i][j];
                } else if (i == 0) {
                    if(j > 0)
                        pref[i][j] = pref[i][j - 1] + matrix[i][j];
                    else { 
                        pref[i][j] = matrix[i][j];
                    }
                } else if (j == 0) {
                    pref[i][j] = pref[i - 1][j] + matrix[i][j];
                }
            }
        }
    }
    
    public void printPref() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(pref[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        if(row1 > 0) {
            if(col1 > 0) {
                ans = pref[row2][col2] - pref[row1 - 1][col2] - pref[row2][col1 - 1] + pref[row1 - 1][col1 - 1];
            } else {
                ans = pref[row2][col2] - pref[row1 - 1][col2];
            }
        } else {
            if(col1 > 0) {
                ans = pref[row2][col2] - pref[row2][col1 - 1];
            } else {
                ans = pref[row2][col2];  
            }
        }
        
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */