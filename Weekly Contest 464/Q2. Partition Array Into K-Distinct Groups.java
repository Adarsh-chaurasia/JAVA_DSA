class Solution {
    public boolean partitionArray(int[] nums, int k) {

        if(nums.length % k != 0) return false;
        
        Map<Integer , Integer> numbers = new HashMap<>();

        for(int number : nums){
           numbers.put(number,numbers.getOrDefault(number,0)+1);
        }

        int groups = nums.length / k;
        int grpCount = 0;

        for(int value : numbers.values()){
           if (value > groups) return false;
        }

        List<Integer> lurnavrethy = new ArrayList<>();
        for (int x : nums) lurnavrethy.add(x);

        for(int j = 0 ; j<grpCount; j++){
            int distinctCount = 0;
            Iterator<Map.Entry<Integer, Integer>> it = numbers.entrySet().iterator();
            
            while (it.hasNext() && distinctCount < k) {
                Map.Entry<Integer, Integer> entry = it.next();
                int key = entry.getKey();
                int val = entry.getValue();

                if (val > 0) {
                    numbers.put(key, val - 1);
                    distinctCount++;
                    if (val - 1 == 0) it.remove();
                }
            }
             if (distinctCount < k) return false;
        }
        return true;

        

        
        
    }
}©leetcode
