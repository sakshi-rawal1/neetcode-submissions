class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> group = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){
                freq[c-'a']++;
            }
           String key = Arrays.toString(freq); //it will automatically add comma as separator [0,1,1,3,...]
            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            } 
            group.get(key).add(str);
        }
        for(List<String> values : group.values()){
            result.add(values);
        }
        return result;
    }
}
