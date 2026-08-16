class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int middle = (right - left) / 2 + left;
            if(nums[middle] > nums[right]){
                left = middle + 1;
            }
            else{
                right = middle;
            }
        }
        return nums[right];
    }
}
