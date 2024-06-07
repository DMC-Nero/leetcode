class Solution {
    public void reverseString(char[] s) {
        char a;
        int b = s.length ;
        int c = b-1;
        if(b > 0){
            for(int i=0 ; i < b/2 ;i++) {
               a = s[i];
                s[i] = s[c];
                s[c] = a;
                c--;
            }
        }
    }
}