class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> group = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int f : freq){
                sb.append(f).append("#");
            }
            String key = sb.toString();
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
