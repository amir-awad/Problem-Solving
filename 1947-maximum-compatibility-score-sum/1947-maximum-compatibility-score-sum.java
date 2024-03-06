class Solution {
    int ans;
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        boolean[] visited = new boolean[students.length];
        helper(mentors, students, 0, visited, 0);
        return ans;
    }
    
    public void helper(int[][]mentors, int[][] students, int idx, boolean[] visited, int score) {
        if(idx >= students.length) {
            ans = Math.max(ans, score);
            return;
        }
        
        for(int i = 0; i < mentors.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                helper(mentors, students, idx + 1, visited, score + score(students[idx], mentors[i]));
                visited[i] = false;
            }
        }
    }
    
    public int score(int[] student, int[] mentor) {
        int cnt = 0;
        for(int i = 0; i < mentor.length; i++) {
            if(student[i] == mentor[i])
                cnt += 1;
        }
        
        return cnt;
    }
}