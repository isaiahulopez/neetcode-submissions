class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> stor = new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                int idx = c - 'a';
                count[idx]++;
            }

            String key = Arrays.toString(count);
            if(!stor.containsKey(key)){
                stor.put(key, new ArrayList<>());
            }
            stor.get(key).add(s);
        }

        return new ArrayList<>(stor.values());
    }
}
