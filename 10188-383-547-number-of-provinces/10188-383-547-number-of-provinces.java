class Solution {
    public int findCircleNum(int[][] isConnected) {
        DSU dsu = new DSU(isConnected.length);
        for(int i = 1; i <= isConnected.length; i++) {
            int[] connections = isConnected[i - 1];
            for(int j = 1; j <= connections.length; j++) {
                if(connections[j - 1] == 1 && i != j) {
                    dsu.union(i, j);
                }
            }
        }

        return dsu.countComponents();
    }
}

class DSU {
    private int[] parent;
    private int[] sizes;

    public DSU(int n) {
        n++;
        parent = new int[n];
        sizes = new int[n];

        for(int i = 1; i < n; i++) {
            parent[i] = i;
            sizes[i] = 1;
        }
    }

    void union(int x, int y) {
        int repX = find(x);
        int repY = find(y);

        if(repX == repY)    return;

        if(sizes[repX] > sizes[repY]) {
            parent[repY] = repX;
            sizes[repX] += sizes[repY];
        } else {
            parent[repX] = repY;
            sizes[repY] += sizes[repX];
        }
    }

    int find(int x) {
        return parent[x] == x ? x : find(parent[x]);
    }

    int countComponents() {
        int count = 0;
        for(int i = 1; i < this.parent.length; i++) {
            if(find(i) == i) count++;
        }

        return count;
    }

}