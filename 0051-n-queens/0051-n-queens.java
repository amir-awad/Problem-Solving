class Solution {
    static int n;
    
    public static boolean isValidState(List<Integer> state) {
        return state.size() == n;
    }

    static List<Integer> getCandidates(List<Integer> state) {
        if (state.isEmpty()) {
            return IntStream.range(0, n).boxed().collect(Collectors.toList());
        }

        int position = state.size(); // row index of the queen being placed
        HashSet<Integer> candidates = new HashSet<>(IntStream.range(0, n).boxed().collect(Collectors.toList()));

        // prune down candidates that place the queen into attacks
        for (int i = 0; i < state.size(); i++) {
            int col = state.get(i);
            // discard the column index if it's occupied by a queen
            candidates.remove(col);
            int distance = position - i; // distance between the current row and the row of the placed queen
            // discard diagonals
            candidates.remove(col + distance);
            candidates.remove(col - distance);

        }

        return candidates.stream().collect(Collectors.toList());
    }


    public static void search(List<Integer> state, List<List<String>> solutions) {
        if (isValidState(state)) {
            solutions.add(new ArrayList<>(stateToString(state)));
            return;
        }

        List<Integer> candidates = getCandidates(state);
        for (Integer candidate : candidates) {
            state.add(candidate);
            search(state, solutions);
            state.remove(state.size() - 1);
        }
    }
    
    public static List<String> stateToString(List<Integer> state) {
        List<String> stateString = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            StringBuilder s = new StringBuilder();
            int col = state.get(i);
            for(int j = 0;j < n; j++) {
                if(j == col) {
                    s.append("Q");
                } else s.append(".");
            }
            stateString.add(s.toString());
        }
        
        return stateString;
    }


    
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        List<List<String>> solutions = new ArrayList<>();
        List<Integer> state = new ArrayList<>();
        search(state, solutions);
        return solutions;
    }
}