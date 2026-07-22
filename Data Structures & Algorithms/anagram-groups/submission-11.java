class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();
        for(String word: strs){
            int[] count = new int[26];
            for(int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(count);

            if(!seen.containsKey(key)){
                seen.put(key, new ArrayList<>());
            }
            seen.get(key).add(word);
        }
        return new ArrayList<>(seen.values());
    }
}
