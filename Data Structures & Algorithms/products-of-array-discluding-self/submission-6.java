class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] rh = new int[length];
        int[] res = new int[length];
        
        int temp_rh = 1;
        int temp_res = 1;

        for(int i = 0; i < length; i++){
            rh[i] = temp_rh;
            temp_rh = temp_rh * nums[i];
        }

        for(int i = length - 1; i >= 0; i--){
            res[i] = temp_res * rh[i];
            temp_res = temp_res * nums[i];
        }

        return res;
    }
}  
