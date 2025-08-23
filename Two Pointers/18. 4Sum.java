class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);  //nlogn
        List<List<Integer>> res = new LinkedList<>();

        for(int i = 0 ; i<nums.length-3 ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int first = nums[i];
        for(int a = i+1 ; a<nums.length-2 ; a++){
            if(a > i+1 && nums[a] == nums[a-1]) continue;

            int third = nums[a];
            int second = a+1 , last = nums.length-1;

            while(second < last)
            {
                long sum = (long) first + nums[second] + nums[last]+third;
                if(sum == target) 
                {
                    res.add(Arrays.asList(first,third, nums[second], nums[last]));
                    while(second < last && nums[second] == nums[second+1]) second++;
                    while(second < last && nums[last] == nums[last-1]) last--;
                    second++;
                    last--;               
                }
                else if(sum < target)
                    second++;
                else    
                    last--;

            }
            
        }
        }

        return res;
        
    }
}
