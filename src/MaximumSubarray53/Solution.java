package MaximumSubarray53;

class Solution {
    /*SOLUTION O(n)
    public int maxSubArray(int[] nums) {
       int currentSum = nums[0];
        int globalSum = currentSum;
        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            if(currentSum>globalSum){
                globalSum = currentSum;
            }

        }
        return globalSum;

    }
    */

    /*SOLUTION DIVIDE AND CONQUER nlog(n)*/
    public int maxSubArray(int[] nums) {
        return maxSubArrayInterval(nums,0,nums.length-1);
    }

    private int maxSubArrayInterval(int [] nums,int low,int high){
        if(low==high){
            return nums[low];
        }
        int mid = (low+high)/2;
        return Math.max(Math.max(maxSubArrayInterval(nums,low,mid),
                maxSubArrayInterval(nums,mid+1,high)),
                maxCross(nums,low,mid,high));
    }

    public int maxCross(int [] nums,int low,int mid,int high){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = mid;i>=low;i--){
            sum+=nums[i];
            if(sum>leftSum){
                leftSum = sum;
            }
        }
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for(int i = mid+1;i<=high;i++){
            sum+=nums[i];
            if(sum>rightSum){
                rightSum = sum;
            }
        }
        return leftSum+rightSum;
    }
}