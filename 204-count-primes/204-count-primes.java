class Solution {
    static int[] sieve;
    public int countPrimes(int n) {
        sieveOfEratosthenes(n);
        
        int ans = 0;
        for(int i=0;i<n;i++)
            ans += sieve[i];
        return ans;
    }
    

    
    static void sieveOfEratosthenes(int n)
    {
        sieve = new int[n+1];
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime,true);
 
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                sieve[i] = 1;
        }
    }
    
    
}