class Solution {

    public int gcd(int m , int n){
        if(n==0) return m;
        else return gcd(n,m%n);
    }


    
    public int gcdOfOddEvenSums(int n) {

        int sumEven = n*(n+1);
        int sumOdd = n*n;

        return gcd(sumEven, sumOdd);
        
    }
}©leetcode
