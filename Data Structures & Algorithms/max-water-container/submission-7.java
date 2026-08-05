class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int n = heights.length - 1;

        int l = 0;
        int r = n;

        while(l < r){
            int curr_max = (r - l) * Math.min(heights[l], heights[r]);
            max = Math.max(max, curr_max);

            if(heights[l] < heights[r]){
                l++;
            }

            else{
                r--;
            }
        }
        return max;
    }
}

