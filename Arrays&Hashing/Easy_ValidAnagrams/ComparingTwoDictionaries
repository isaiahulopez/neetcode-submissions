class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sdic = new HashMap<>();
        Map<Character, Integer> tdic = new HashMap <>();
        for(int i = 0; i < s.length(); i++){
            if(!sdic.containsKey(s.charAt(i))){
                sdic.put(s.charAt(i), 0);
            }
            sdic.put(s.charAt(i), sdic.get(s.charAt(i)) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            if(!tdic.containsKey(t.charAt(i))){
                tdic.put(t.charAt(i), 0);
            }
            tdic.put(t.charAt(i), tdic.get(t.charAt(i)) + 1);
        }
        return tdic.equals(sdic);
    }
}
