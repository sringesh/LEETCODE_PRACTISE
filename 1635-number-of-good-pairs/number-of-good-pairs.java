class Solution {
    public int numIdenticalPairs(int[] nums) {
        Integer count =0;
        Integer i;
        Integer j;
        for(i=0;i<nums.length;i++){
           for(j=i;j<nums.length;j++){
            if(nums[i]==nums[j]){
                if(i<j){
                    count++;
                }
            }
           }

        }
        return count;
    }

}