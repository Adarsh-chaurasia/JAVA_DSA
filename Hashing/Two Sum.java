class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer , Integer> hashMap = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            int second = target - nums[i];

            if(hashMap.containsKey(second)){
            return new int[]{hashMap.get(second),i};

            }

            else {
                hashMap.put(nums[i] , i);
            }




        }

            return new int[0];
        
    }
}
