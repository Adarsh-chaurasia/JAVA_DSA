class Solution {
    public int countQuadruplets(int[] nums) {
        Map<Integer,List<Integer>> sumMap = new HashMap<>();
        int count = 0;
        for(int a = 0 ; a<nums.length-1 ; a++)
        {
            for(int j = a+1 ;j<nums.length;j++){

                int sum = nums[a] + nums[j];

                sumMap.putIfAbsent(sum, new ArrayList<>());
                sumMap.get(sum).add(j);

            }


        }

        for(int i = 2 ; i<nums.length-1 ; i++)
        {
            for(int j = i+1 ;j<nums.length;j++){

                int target = nums[j] - nums[i];

                if(sumMap.containsKey(target))
                {
                    for(int idx : sumMap.get(target)){
                        if(idx < i ){
                            count++;
                        }
                    }

                }
                
            }


        }

        return count;

           
          
        
    }
}
