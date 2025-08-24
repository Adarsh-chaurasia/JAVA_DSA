class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> hashMap = new HashMap<>();

        for(String each : strs)
        {

            char[] charArray = each.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            hashMap.putIfAbsent(sortedString , new ArrayList<>());
            hashMap.get(sortedString).add(each);
            
        }

        return new ArrayList<>(hashMap.values());


        
    }
}
