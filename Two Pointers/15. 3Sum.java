class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for(int a = 0 ; a<nums.length ; a++){
            if(a > 0 && nums[a] == nums[a-1]) continue;

            int first = nums[a];
            int second = a+1 , last = nums.length-1;

            while(second < last)
            {
                int sum = first + nums[second] + nums[last];
                if(sum == 0) 
                {
                    res.add(Arrays.asList(first, nums[second], nums[last]));
                    while(second < last && nums[second] == nums[second+1]) second++;
                    while(second < last && nums[last] == nums[last-1]) last--;
                    second++;
                    last--;               
                }
                else if(sum < 0)
                    second++;
                else    
                    last--;

            }
            
        }

        return res;

        
    }
}
