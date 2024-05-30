class Solution {
    public int addDigits(int num) {
        if (num >= 0 && num < 10){
            return num;
        }
        if( num % 9 == 0){
            return 9;
        }
        if( num > 9) {
            num = num % 9;
        }
        return num;
    }
}