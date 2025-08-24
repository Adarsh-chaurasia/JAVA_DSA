class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {

        long noOfWays = 0;
        long value = 0;

            for(int x = 0;;x++){
                value = total - (cost1*x);
                if(value < 0) break;

                noOfWays += (long)Math.floor((long)value/(long)cost2) + 1; 
            }

            return noOfWays;

        

    }
}
