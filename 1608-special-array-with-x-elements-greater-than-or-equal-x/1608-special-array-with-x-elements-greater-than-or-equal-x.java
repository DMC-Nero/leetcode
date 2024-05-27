class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i =1 ; i <= n ; ++i) {
            if(i == findNumberOfNums(nums, n, i)) {
                return i;
            }
        }
        return -1;
    }
    private int findNumberOfNums(int[] nums, int n, int curNum) {
        int left = 0;
        int right = n-1;
        int index = n;

        while (left <= right) {
            int res = (left + right) /2;

            if(nums[res] >= curNum) {
                index = res;
                right = res - 1;
            }else {
                left = res + 1;
            }
        }
        return n - index;
    }
}