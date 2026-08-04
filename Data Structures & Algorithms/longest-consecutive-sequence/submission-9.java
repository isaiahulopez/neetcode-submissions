class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int n: nums){
            seen.add(n);
        }

        int longest = 0;
        for(int n: nums){
            if(!seen.contains(n - 1)){
                int curr_length = 1;
                while(seen.contains(n + curr_length)){
                    curr_length++;
                }
                longest = Math.max(longest, curr_length);
            }
        }
        return longest;
    }
}
