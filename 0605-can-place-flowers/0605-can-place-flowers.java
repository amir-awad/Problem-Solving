class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int maxFlowers = 0;
        for(int i = 0; i < len; i++) {
            if(flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if(emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    maxFlowers++;
                }
            }
        }
        
        return n <= maxFlowers;
    }
}