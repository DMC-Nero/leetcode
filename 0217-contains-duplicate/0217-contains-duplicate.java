class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create hashset to store integers
        Set<Integer> newSet = new HashSet<>();
        
        // Iterate over each element
        for( int num : nums) {
            
            // Check the number in hashSet
            if(newSet.contains(num))
                return true;
            
            // Add the number to hashset
            newSet.add(num);
        }
        return false;
    }
}