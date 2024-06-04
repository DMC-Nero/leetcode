class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0 ){
            return 0;
        }
        int n = nums.length;
        int sum = 0;
        for(int x : nums){
            sum = sum + x;
        }
        
        return ((n*(n+1)) /2) - sum;
    }
}