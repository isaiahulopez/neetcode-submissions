class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int temp_prod = 1;
            for(int k = 0; k < n; k++){
                if(i != k){
                    temp_prod = temp_prod * nums[k];
                }
            }
            res[i] = temp_prod;
        }
        return res;
    }
}  
