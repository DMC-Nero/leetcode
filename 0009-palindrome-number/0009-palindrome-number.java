class Solution {
    public boolean isPalindrome(int x) {
        String sum = "";
		String len = Integer.toString(x);
		for(int i=0;i<len.length();i++) {
			int rem = x % 10;
			sum = sum + rem;
			x = x/10;
		}
		
		if(len.equals(sum)) {
			return true;
		}else {
			return false;
		}

    }
}