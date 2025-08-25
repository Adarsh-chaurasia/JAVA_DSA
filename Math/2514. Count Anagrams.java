class Solution {
    static final int MOD = 1000000007;
    static long[] fact;        
    static long[] invFact;     
    static int MAX = 100005;     
    

    public static void precomputeFactorials() {
        fact = new long[MAX + 1];
        invFact = new long[MAX + 1];
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[MAX] = modInverse(fact[MAX], MOD);
        for (int i = MAX - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    public static long modInverse(long a, int m) {
        return modPow(a, m - 2, m);
    }

    public static long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static long countAnagramsForWord(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        int n = word.length();
        for (char c : word.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        long numerator = fact[n];
        long denominator = 1;
        for (int freqCount : freq.values()) {
            denominator = (denominator * fact[freqCount]) % MOD;
        }
        return (numerator * modInverse(denominator, MOD)) % MOD;
    }

    public int countAnagrams(String s) 
    {
        precomputeFactorials();
        String[] words = s.split(" ");
        long count = 1;
        for(String word : words)
        {
            long val = countAnagramsForWord(word);
            count = (count * val) % MOD;
        }

        return (int) count;
        
        




    }
}
