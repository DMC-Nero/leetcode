class Solution {
    public boolean isPowerOfFour(int n) {
        int a = (n & (n-1));
        int b = (n-1)%3; 
        if(n<=0){
            return false;
        }
        if(a == 0 && b == 0){
            return true;
        }
        return false;
    }
}