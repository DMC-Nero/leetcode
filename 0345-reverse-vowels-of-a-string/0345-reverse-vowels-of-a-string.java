class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while(start < end){
            if(!isVowel(arr[start])){
                start ++;
            }else if(!isVowel(arr[end]) ){
                end--;
            }else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
            
           
        }
   
            return String.valueOf(arr);
    }
    
    public boolean isVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' ){
            return true;
        }else {
            return false;
        }
    }
}