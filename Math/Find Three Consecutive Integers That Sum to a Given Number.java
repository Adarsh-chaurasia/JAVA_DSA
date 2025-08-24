class Solution {
    public long[] sumOfThree(long num) 
    {
        if(num%3 == 0)
        {
            long k = num/3;

            return new long[]{k-1,k,k+1};
        }

        else  return new long[]{};
    }
}
