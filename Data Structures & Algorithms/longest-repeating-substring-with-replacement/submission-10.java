class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> window = new HashMap<>();
        int left = 0;
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            while((i - left + 1) - Collections.max(window.values()) > k){
                char l = s.charAt(left);
                window.put(l, window.get(l) - 1);
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        
        return res;
    }
}
