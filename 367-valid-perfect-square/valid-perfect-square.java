class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        if(num==0){
            return true;
        }
        int left =1;
        int right =num;
        while(left<=right){
            int mid = left +(right-left)/2;
            long squre = (long)mid*mid;
            if(squre==num){
                return true;
            }
            if(squre>num){
                right=mid-1;
            }
            if(squre<num){
                left=mid+1;
            }
        }
        return false;
    }
}