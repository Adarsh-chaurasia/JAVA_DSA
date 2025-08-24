if(nums.length % k != 0) return false;
        
        Map<Integer , Integer> numbers = new HashMap<>();

        for(int number : nums){
           numbers.put(number,numbers.getOrDefault(number,0)+1);
        }

        int groups = nums.length / k;

        for(int value : numbers.values()){
           if (value > groups) return false;
        }

        
        return true;
©leetcode
