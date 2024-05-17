//T.C - O(n) , S.C - O(1)


class Solution {
    public int maxSubArray(int[] nums) {
        int startmax=Integer.MIN_VALUE;
        int endmax=0;
        for(int i =0;i<nums.length;i++){
            endmax=endmax+nums[i];
            if(startmax<endmax){
                startmax=endmax;
            }
            if(endmax<0){
                endmax=0;
            }
        }
        return startmax;

    }
}
