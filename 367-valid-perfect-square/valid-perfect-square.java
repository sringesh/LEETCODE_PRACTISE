class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        if(num==0){
            return true;
        }
        int i;
        for(i =1;i<=num/i;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}