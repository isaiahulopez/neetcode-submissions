class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> storage = new HashMap<>();

        for (String word : strs){
            int[] count = new int[26];
            for (int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);

            if(!storage.containsKey(key)){
                storage.put(key, new ArrayList<>());          
            }
            storage.get(key).add(word);
        }

        return new ArrayList<>(storage.values());
    }
}
