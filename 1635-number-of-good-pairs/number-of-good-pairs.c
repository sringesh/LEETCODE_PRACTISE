int numIdenticalPairs(int* nums, int numsSize) {
    int count =0;
    for(int i =0;i<numsSize;i++){
        for(int j=i;j<numsSize;j++){
            if(nums[i]==nums[j]){
                if(i<j){
                    count++;
                }
            }
        }
    }
    return count;
}