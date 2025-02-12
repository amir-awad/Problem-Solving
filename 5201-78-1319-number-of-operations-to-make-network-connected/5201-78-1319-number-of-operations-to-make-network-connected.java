class Solution {
    public int makeConnected(int n, int[][] connections) {
        DSU dsu = new DSU(n);
        int extraLinks = 0;
        
        for (int[] connection : connections) {
            int xLeader = dsu.find(connection[0]);
            int yLeader = dsu.find(connection[1]);
            if (xLeader == yLeader) {
                extraLinks++;
            } else {
                dsu.union(connection[0], connection[1]);
            }
        }

        int components = 0;
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) {
                components++;
            }
        }

        return (extraLinks >= components - 1) ? components - 1: -1;
    }
}

class DSU {
    private int[] parent;
    private int[] groupSizes;

    public DSU(int n) {
        parent = new int[n];
        groupSizes = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            groupSizes[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public void union(int x, int y) {
        int xLeader = find(x);
        int yLeader = find(y);

        if(xLeader == yLeader) return;

        if (groupSizes[xLeader] > groupSizes[yLeader]) {
            parent[yLeader] = xLeader;
            groupSizes[xLeader] += groupSizes[yLeader];
        } else {
            parent[xLeader] = yLeader;
            groupSizes[yLeader] += groupSizes[xLeader];
        }
    }

    public int getSize(int x) {
        return this.groupSizes[x];
    }
}