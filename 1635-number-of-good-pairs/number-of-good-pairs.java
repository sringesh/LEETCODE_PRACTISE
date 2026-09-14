class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        Integer good_pairs = 0;
        for(int num : nums){
            good_pairs += freq[num];
            freq[num]++;
        }
        return good_pairs;
    }
}