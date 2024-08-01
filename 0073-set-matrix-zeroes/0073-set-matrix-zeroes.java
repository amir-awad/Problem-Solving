class Solution {
    
    public static void setZeroesHelper(int[][] matrix, int r, int c, boolean[][] visited) {
        int m = matrix.length;
        int n = matrix[0].length;
        //System.out.println(r + " " + c);
        for(int i = 0; i < m; i++) {
            if(matrix[i][c] != 0) {
                matrix[i][c] = 0;
                visited[i][c] = true;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        for(int j = 0; j < n; j++) {
            if(matrix[r][j] != 0) {
                matrix[r][j] = 0;
                visited[r][j] = true;
            }
        }
    }
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0 && !visited[i][j]) {
                    visited[i][j] = true;
                    setZeroesHelper(matrix,i, j, visited);
                }
            }
        }
    }
}