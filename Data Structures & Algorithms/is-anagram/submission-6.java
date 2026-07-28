class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int[] balancer = new int [26];
        int[] checker = new int[26];

        for(int i = 0; i < s.length(); i++){
            balancer[s.charAt(i) - 'a']++;
            balancer[t.charAt(i) - 'a']--;
        }

        return Arrays.equals(balancer, checker);
    }
}
